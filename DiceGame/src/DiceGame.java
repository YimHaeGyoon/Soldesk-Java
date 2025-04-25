/*
 * 생성자 : 임해균
 * 생성일 : 25.04.25
 * 파일명 : DiceGame.java
 * 수정자 : 
 * 수정일 : 
 * 설명 : 팀프로젝트 주사위게임
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class DiceGame extends JFrame {
	private JLabel diceLabel1, diceLabel2, resultLabel; // 주사위 이미지와 결과 텍스트 출력용
	private JTextField nameField; // 이름 입력 필드
	private JButton rollButton; // 주사위 굴리기 버튼
	private Timer rollTimer; // 주사위 굴리는 애니메이션용 타이머
	private int rollCount = 0; // 타이머 반복 횟수
	private final Random rand = new Random(); // 랜덤 객체 (주사위 굴림용)

	public DiceGame() {
		setTitle("Team.DM 주사위 게임"); // 창 제목
		setSize(600, 400); // 창 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // 전체 레이아웃 설정

		// 🧩 상단: 이름 입력 + 버튼 패널
		JPanel topPanel = new JPanel(new FlowLayout());
		JLabel nameLabel = new JLabel("이름을 입력하세요:");
		nameLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		topPanel.add(nameLabel);

		nameField = new JTextField(10);
		nameField.setFont(new Font("SansSerif", Font.PLAIN, 16));
		topPanel.add(nameField);

		rollButton = new JButton("🎲 주사위 굴리기!");
		rollButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		topPanel.add(rollButton);

		add(topPanel, BorderLayout.NORTH); // 상단에 부착

		// 📋 중앙: 결과 출력 라벨
		resultLabel = new JLabel("결과를 기다리는 중...");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		add(resultLabel, BorderLayout.CENTER);

		// 🎲 하단: 주사위 이미지 표시 패널
		JPanel dicePanel = new JPanel(new FlowLayout());
		diceLabel1 = new JLabel(new ImageIcon("images/dice1.png"));
		diceLabel2 = new JLabel(new ImageIcon("images/dice1.png"));
		dicePanel.add(diceLabel1);
		dicePanel.add(diceLabel2);
		add(dicePanel, BorderLayout.SOUTH);

		// 버튼 클릭 시: 주사위 굴리기 시작
		rollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playerName = nameField.getText().trim();

				// 이름이 비어 있으면 경고창
				if (playerName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요!");
					return;
				}

				rollButton.setEnabled(false); // 중복 클릭 방지
				rollCount = 0; // 타이머 초기화

				// ⏱️ 타이머로 주사위 굴리는 애니메이션 구현
				rollTimer = new Timer(100, new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						rollCount++;

						// 랜덤 숫자 1~6 (임시 이미지 표시용)
						int temp1 = rand.nextInt(6) + 1;
						int temp2 = rand.nextInt(6) + 1;
						diceLabel1.setIcon(new ImageIcon("images/dice" + temp1 + ".png"));
						diceLabel2.setIcon(new ImageIcon("images/dice" + temp2 + ".png"));

						// 10회 반복 후 실제 결과 표시
						if (rollCount >= 10) {
							rollTimer.stop(); // 타이머 멈춤

							// 최종 주사위 결과
							int final1 = rand.nextInt(6) + 1;
							int final2 = rand.nextInt(6) + 1;

							diceLabel1.setIcon(new ImageIcon("images/dice" + final1 + ".png"));
							diceLabel2.setIcon(new ImageIcon("images/dice" + final2 + ".png"));

							int sum = final1 + final2;
							resultLabel.setText(playerName + "의 주사위 합: " + sum);

							rollButton.setEnabled(true); // 버튼 다시 활성화
						}
					}
				});

				rollTimer.start(); // 타이머 시작
			}
		});

		setVisible(true); // 창 띄우기
	}

	public static void main(String[] args) {
		new DiceGame(); // 프로그램 실행
	}
}

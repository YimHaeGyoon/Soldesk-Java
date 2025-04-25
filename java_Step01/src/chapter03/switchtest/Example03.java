package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Example03 {

	public static void main(String[] args) {
		// null (아무것도 입력이안된 상황) -> String str=null
		// isEmpty(문자길이가 0) -> String str="";

		// if문으로 input == null이거나 isEmpty() 면 메세지 박스를 이용하여 출력
		// 입력값이 없습니다.

		// 'A' 'B' 'C' 'D' 'F'
		String input = JOptionPane.showInputDialog("등급을 입력하세요 (A~F):");

		if (input == null || input.isEmpty()) {
			JOptionPane.showMessageDialog(null, "입력이 없습니다.");
			return;
		}

		char grade = Character.toUpperCase(input.charAt(0));
		String message;

		// switch 사용
		switch (grade) {
		case 'A':
			message = "탁월합니다!";
			break;
		case 'B':
			message = "좋습니다!";
			break;
		case 'C':
			message = "괜찮습니다.";
			break;
		case 'D':
			message = "더 노력하세요.";
			break;
		case 'F':
			message = "불합격입니다..";
			break;
		default:
			message = "없는 등급입니다.";

			// MessageDialog 출력
			JOptionPane.showMessageDialog(null, "입력한 등급: " + grade + "\n코멘트:" + message);
		}
	}
}

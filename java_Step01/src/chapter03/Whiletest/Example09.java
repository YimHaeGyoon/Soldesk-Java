package chapter03.Whiletest;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 컴퓨터가 선택한 서로 다른 3자리 수
		int n1, n2, n3;
		do {
			n1 = (int) (Math.random() * 9) + 1;
			n2 = (int) (Math.random() * 9) + 1;
			n3 = (int) (Math.random() * 9) + 1;
		} while (n1 == n2 || n2 == n3 || n1 == n3);

		int tryCount = 0;

		System.out.println("숫자 야구 게임 시작!(1~9 사이로 서로 다른 숫자 3개)");
		// 3 7 1 //7 2 5
		while (true) {
			tryCount++;

			System.out.println("입력 (공백으로 구분)");
			int user1 = sc.nextInt();
			int user2 = sc.nextInt();
			int user3 = sc.nextInt();

			int strike = 0;
			int ball = 0;

			// strike=> n1==user1 n2==user2 n3==user3
			// ball=> n1==user2 n1==user3/ n2==user1 n2==user3 / n3==user1 n3==user2
			if (n1 == user1) {
				strike++;
			} else if (n1 == user2 || n1 == user3) {
				ball++;
			}

			if (n2 == user2)
				strike++;
			else if (n3 == user1 || n2 == user3) {
				ball++;

				if (n3 == user3) {
					strike++;
				} else if (n3 == user1 || n3 == user2) {
					ball++;
				}

				if (strike == 3) {
					System.out.println("★홈런~~승!!");
					System.out.println("총 시도 횟수: " + tryCount + "번");
					break;

				}
			} // while
		}
	}// m

}// c

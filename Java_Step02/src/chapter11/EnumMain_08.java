package chapter11;

import java.util.Scanner;

public class EnumMain_08 {

	public enum Item {
		Start, Pause, Exit
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요 [0:게임시작, 1:일시정지, 2:게임종료] : ");

			int n = scan.nextInt();

			Item start = Item.Start; // start를 0저의
			Item Pause = Item.Pause; // pause 1정의
			Item Exit = Item.Exit; // exit 2정의

			if (n == start.ordinal()) {
				System.out.println("게임이 시작함");
			} else if (n == Pause.ordinal()) {
				System.out.println("게임이 일시 정지됨");
			} else if (n == Exit.ordinal()) {
				return;
			} else {
				System.out.println("서비스 지원이 없는 번호 입니다.");
			}

		} // while

	}

}

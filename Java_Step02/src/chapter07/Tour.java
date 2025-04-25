package chapter07;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("관광객 수 : ");
		int n = scan.nextInt();

		// 초기화를 통해서 메모리 확보 및 고객생성(Guide의 객체)
		Guide_04 guide = new Guide_04(n);

		System.out.println();
		System.out.println("관광객 등록");

		// 관광객 등록 (for)
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". 이름:");
			String name = scan.next();
			guide.guest[1].setName(name);

			System.out.println((i + 1) + ". 성별: ");
			String gender = scan.next();

		}

	}

}

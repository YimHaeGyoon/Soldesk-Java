package chapter06;

import java.util.Scanner;

public class CanMain_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money = 0;

		// 음료 준비
		Vending ven = new Vending();
		ven.init(); // 음료준비 완료
		System.out.println("돈을 투입하세요: ");
		money = Integer.parseInt(scan.nextLine()); // 돈투입
		ven.showCans(money);
		System.out.println("=======================");

		System.out.println("음료를 선택하세요: ");
		String select = scan.nextLine();
		ven.outCan(select);

	}

}

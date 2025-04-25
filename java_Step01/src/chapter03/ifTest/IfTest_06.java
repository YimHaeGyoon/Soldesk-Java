package chapter03.ifTest;

import java.util.Scanner;

public class IfTest_06 {

	public static void main(String[] args) {
		// 두수를 입력받아 어떤 수가 큰지 판단하는 프로그램
		// num1, num2 의 수가 num1이 큽니다. 또는 num2가 큽니다. 또는 같습니다의 결과가 나오도록 구현
		// 그외값은 다시 입력하세요 로 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.println("두번째 수를 입력하세요");
		int num2 = Integer.parseInt(scan.nextLine());
		if(num1>num2) {
			System.out.println("num1이 큽니다.");
		}else if (num2>num1) {
			System.out.println("num2가 큽니다.");
		}else {
			System.out.println("num1과 num2가 같습니다.");
		
		} 
		
		System.out.println("그외값은 다시 입력하세요.");
		
	}
		
}


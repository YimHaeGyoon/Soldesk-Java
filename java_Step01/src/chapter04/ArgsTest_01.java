package chapter04;

public class ArgsTest_01 {

	public static void main(String[] args) {
		// 배열(Array)

		// int numbers[]=new int[5];
		int[] numbers = new int[5];

		numbers[0] = 10;
		numbers[1] = 10;
		numbers[2] = 10;
		numbers[3] = 10;
		numbers[4] = 10;

		int len = numbers.length;
		System.out.println("numbers의 갯수:" + len);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "번첨자의 요소: " + numbers[i]);
		}
	}

}

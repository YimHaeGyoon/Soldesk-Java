package chapter03.fortest;

public class Fortest_12 {

	public static void main(String[] args) {
		System.out.println("미로 맵(O:길, X:벽");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if ((i + j) % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("X ");
				} // if

			} // in
		} // out
	} // m
}// c
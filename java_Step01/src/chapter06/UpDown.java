package chapter06;

public class UpDown {

	int num;

	public UpDown() {
		num = (int) (Math.random() * 49) + 1;
	}

	public String check(int select) {
		if (select > 50 || select < 1) {
			return "Error";
		}

		if (select == num) {
			return "Success";
		} else if (num > select) {
			return "Up";
		} else {
			return "Down";

		} // if
	} // check
}// class

package chapter06;

public class CarMain {

	public static void main(String[] args) {

		Car_04 date = new Car_04();

		date.company = "기아";
		date.model = "k5";
		date.color = "흰색";
		System.out.println("제작사 " + date.company + "모델명 " + date.model + "색상 " + date.color + "최고속도 " + date.maxSpeed
				+ "최저속도 " + date.speed);

		// int maxSpeed = 280;
		// int speed; // 0
	}

}

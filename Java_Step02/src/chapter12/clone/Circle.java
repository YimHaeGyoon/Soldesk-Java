package chapter12.clone;

//Cloneable: 복제가 가능한 클래스로 선언
//Cloneable 선언시 반드시 clone()메서드 오버라이드를 선언
public class Circle implements Cloneable {

	Point point;
	int radius;

	public Circle(int x, int y, int radius) {
		// 생성자에서 Point의 객체 생성 즉 Circle의 객체가 만들어지면 Point의 객체가 필수로 생성됨
		this.point = point;
		this.radius = radius;

	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
		this.point = point;
		this.radius = radius;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

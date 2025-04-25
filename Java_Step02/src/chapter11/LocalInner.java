package chapter11;

class Outter {

	// 외부 클래스 멤버변수
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {
		
		int num= 100;
	
	class MyRunnalble implements Runnable {
		
		int localNum=10; //내부 클래스 멤버변수
		return null;
		
		
	}//getRunnable
	
	//Outter class


public class LocalInner {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
	}
	
	
	}

}

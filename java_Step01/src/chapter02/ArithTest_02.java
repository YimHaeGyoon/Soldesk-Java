package chapter02;

public class ArithTest_02 {

	public static void main(String[] args) {
		// +,-,*,/,%
		
		int a1=5;
		int a2=2;
		
		int result1=a1+a2;
		System.out.println(result1);
		System.out.println((double)result1);
		System.out.println((double)result1/2);
		
		
		double a3=3.2;
		double a4=6.1;
		
		System.out.println("총점"+ (a3+a4));
		System.out.println("평균"+ (a3+a4)/2);
		
		double a5=35;
		double a6=21;
		double a7=26;
		double a8=29;
		
		System.out.println("평균"+(a5+a6+a7+a8));
				
		double result4=(double)a1/a2;
		System.out.println(result4);
		
		int result5=a1%a2;
		System.out.println(result5);
		
				
		
	

	}

}

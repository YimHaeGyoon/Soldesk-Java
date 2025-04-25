package chapter02;

public class ArithTest_01 {

	public static void main(String[] args) {
		// 총점과 평균
		int mathScore=96;
		int engScore=87;
		
		//총점
		System.out.println("총점:"+(mathScore+engScore));
	    //평균
		System.out.println("평균:"+(mathScore+engScore)/2);
        System.out.println("------------");

        
        System.out.println("평균:"+(mathScore+engScore)/2.0);
	    System.out.println("평균: "+(mathScore+engScore)/2f);
	    System.out.println("평균:"+(double)(mathScore+engScore)/2);
	    
	    double tota1=mathScore+engScore;
	    System.out.println(tota1);
	    double average=tota1/2;
	    System.out.println("평균:"+average);
	    
	
	
	}

}

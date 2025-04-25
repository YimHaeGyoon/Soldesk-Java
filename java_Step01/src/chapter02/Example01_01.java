package chapter02;

public class Example01_01 {

	public static void main(String[] args) {
		// 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
		
		int a= 534;
		int b = 30;
		int c = a / b;
		int d = a % b;
		System.out.println("학생당 책 수 "+ c);
		System.out.println("남는 책 수 "+ d);
		
		
	
		/*soldesk 과수원
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		 * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange; //하루 총 생산량
		
		float averagePerHour = (float) total / 24; //시간당 평균
		
		
		System.out.println("하루 총 과일 생산량:"+ total+"개");
		System.out.println("시간당 평균 과일 생산량:"+ averagePerHour+"개");
		
		
	}

}

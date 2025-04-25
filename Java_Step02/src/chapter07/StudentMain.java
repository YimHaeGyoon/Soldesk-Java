package chapter07;

public class StudentMain {

	public static void main(String[] args) {

		// studentLee 이수정으로 설정후 serialNum과 StudentName 출력

		System.out.println();
		Student_03 studentLee = new Student_03();
		studentLee.setStudentName("이수정");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.seriaLNum);
		studentLee.seriaLNum++;

		System.out.println();
		Student_03 studentKim = new Student_03();
		studentKim.setStudentName("김우성");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.seriaLNum); // 10001
		studentKim.seriaLNum++;

		System.out.println();
		Student_03 studentPark = new Student_03();
		studentKim.setStudentName("박정우");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.seriaLNum); // 10002
	}

}

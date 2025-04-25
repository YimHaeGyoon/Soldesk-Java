package chapter12.string;

public class Student {

	int studentId;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studentId = studentID;
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {

		return studentId;
	}

	// 논리적 주소 (내용을 비교)
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId) {// 존재하는 id인지 확인
				return true;
			} else {
				return false;
			}
		} else {

			return false;

		}
	}
}

package chapter04;

public class EnhancedForLoop_11 {

	public static void main(String[] args) {

		String strArray[] = { "Java", "Oracle", "HTML5", "CSS", "JSP", "Spring", "Python" };

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i] + " ");
		}
		System.out.println();

		for (String lang : strArray) {
			System.out.println(lang + " ");
		}

	}

}

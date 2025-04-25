package chapter03.ifTest;

import javax.swing.JOptionPane;

public class IfTest_04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		
		int age;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
	    if (age <= 7) {
	    System.out.println("1000원");
	    }else if (age <= 13) {
	    System.out.println("2000원");
	    }else if (age <= 19) {
	    System.out.println("3500원");
	    }else if (age <= 20) {
	    System.out.println("5000원");
	    }
	    
	    
		
	

	}

}

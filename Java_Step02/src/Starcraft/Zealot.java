package Starcraft;

public class Zealot extends StarUnit {
	int att = 8 * 2;
	int shd = 100;

	public Zealot() {
		type = 0;
	}

	void attack(StarUnit Unit) {
		System.out.println("치지직");
	}

}

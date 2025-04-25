package Starcraft;

public class Vulture extends StarUnit {
	int Spd = 100;
	int att = 20;

	void attack(Zealot zeal) {
		if (zeal.type == 0) {
			zeal.hp -= att * 2;

		}
	}

}

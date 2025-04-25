package Starcraft;

public class StarUnit {
	int hp;
	int type;

	void attack(StarUnit Unit) {
		Unit.hp -= 10;
		System.out.println("스타유닛이 공격합니다.");
	}
}

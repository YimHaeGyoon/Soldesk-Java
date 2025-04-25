package chapter09;

public class Wizard extends GameCharacter {

	@Override
	protected void atack() {
		System.out.println("마법사가 검으로 베기 공격을 합니다");

	}

	@Override
	protected void useUItimate() {
		System.out.println("마법사가 메테오 스톰을 시전합니다.");

	}

}

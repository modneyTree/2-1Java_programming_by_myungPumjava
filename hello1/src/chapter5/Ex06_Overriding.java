package chapter5;

class Weapon {
	protected int fire() {
		return 1; // 무기는 기본적으로 한 명만 살상
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10; // 대포는 한 번에 10명을 살상
	}
}

public class Ex06_Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}
}
import java.util.Random;

public class Knight extends Character {
	private static final int MIN = 2;
	private static final int MAX = 12;
	private static final Random random = new Random();

	public Knight() {
		this.power = MIN + random.nextInt(MAX - MIN + 1);
		this.hp = MIN + random.nextInt(MAX - MIN + 1);
	}

	@Override
	public void kick(Character c) {
		int damage = 1 + random.nextInt(this.power);
		c.hp = Math.max(0, c.hp - damage);
	}
}

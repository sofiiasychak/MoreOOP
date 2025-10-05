import java.util.Random;

public class King extends Character {
	private static final int MIN = 5;
	private static final int MAX = 15;
	private static final Random random = new Random();

	public King() {
		this.power = MIN + random.nextInt(MAX - MIN + 1);
		this.hp = MIN + random.nextInt(MAX - MIN + 1);
	}

	@Override
	public void kick(Character c) {
		int damage = 1 + random.nextInt(this.power); 
		c.hp = Math.max(0, c.hp - damage);
	}
}

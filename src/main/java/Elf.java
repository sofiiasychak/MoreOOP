public class Elf extends Character {

	public Elf() {
		this.power = 10;
		this.hp = 10;
	}

	@Override
	public void kick(Character c) {
		if (this.power > c.power) {
			c.hp = 0;
		} else {
			c.power = Math.max(0, c.power - 1);
		}
	}
}

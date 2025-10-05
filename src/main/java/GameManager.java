public class GameManager {

	public void fight(Character c1, Character c2) {
		System.out.println("Fight starts between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());
		int round = 1;
		while (c1.isAlive() && c2.isAlive()) {
			System.out.println("\nRound " + round + ":");
			System.out.println(c1.getClass().getSimpleName() + " (hp=" + c1.hp + ", power=" + c1.power + ") kicks " + c2.getClass().getSimpleName());
			c1.kick(c2);
			System.out.println(c2.getClass().getSimpleName() + " (hp=" + c2.hp + ", power=" + c2.power + ")");
			if (!c2.isAlive()) {
				System.out.println(c2.getClass().getSimpleName() + " is dead!");
				break;
			}
			System.out.println(c2.getClass().getSimpleName() + " (hp=" + c2.hp + ", power=" + c2.power + ") kicks " + c1.getClass().getSimpleName());
			c2.kick(c1);
			System.out.println(c1.getClass().getSimpleName() + " (hp=" + c1.hp + ", power=" + c1.power + ")");
			if (!c1.isAlive()) {
				System.out.println(c1.getClass().getSimpleName() + " is dead!");
				break;
			}
			round++;
		}
		System.out.println("\nFight ended.");
	}
}

import java.util.Random;

public class CharacterFactory {
	private static final Random random = new Random();
	private static final Class<?>[] characterClasses = new Class<?>[] {
		Elf.class, King.class, Knight.class
	};

	public Character createCharacter() {
		int idx = random.nextInt(characterClasses.length);
		try {
			return (Character) characterClasses[idx].getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Failed");
		}
	}
}

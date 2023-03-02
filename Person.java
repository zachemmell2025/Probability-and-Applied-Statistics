import java.util.Random;

/**
 * 
 * @author Zach Emmell
 * 
 * This class is used for the Birthday class to generate a person with a random birthday
 *
 */
public class Person {
	
	private int birthDate;

	public Person() {
		Random random = new Random();
		birthDate = 1 + random.nextInt(364);
	}
	
	public int getPerson() {
		return birthDate;
	}
}

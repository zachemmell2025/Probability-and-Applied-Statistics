import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Zach Emmell
 *
 */
public class Birthday {
/**
 * User inputs the size of the class, and gets the probability
 * of two people having the same birthday. Uses the Person class to create a person
 * with a birthday field	
 * @param classSize
 * @return the probability of two people having the same birthday
 */
	
	public static double birthdayProbability(int classSize) {
		ArrayList<Integer> birthdays = new ArrayList<Integer>();
		for(int x = 0; x < classSize; x ++) {
			Person person = new Person();
			birthdays.add(x, person.getPerson());
		}
		int count = 0;
		double loops = 0.0;
		for(int i = 0; i < birthdays.size(); i++) {
			for(int j = 1; j < birthdays.size(); j++) {
				if(birthdays.get(i) != birthdays.get(j)) count = count + 1;
				loops = loops + 1;
			}
		}
		loops = loops / 2;
		count = count / 2;
		//double prob = 364/365;
		double probability = 1 - Math.pow((count / loops) , loops);
		return probability;
		
	}
	
	public static void main(String[] args) {
		System.out.println("The proabaility that 23 people in a class have the same birthday is " + birthdayProbability(23));
		//System.out.println("There were ");
	}

}

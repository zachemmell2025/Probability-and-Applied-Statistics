
/**
 * 
 */

/**
 * @author Zachary Emmell
 *
 */
import java.util.Random;

public class DoorGame {

	/**
	 * plays the game with the winning door as the second one a random door is
	 * chosen.
	 *  
	 *  If doorchange is true, it will pick a different door if you did not get the right door the first time
	 * @param doorchange
	 */
	public static double playGame(boolean doorchange) {
		int door = 2;
		int win = 0;
		//int loss = 0;
		for (int i = 0; i < 10000; i++) {
			Random random = new Random();
			int choice1 = 1 + random.nextInt(2);
			if (choice1 == door) {
				//System.out.println("Win");
				win = win + 1;
			}
			
			
			if (doorchange == true && choice1 != door) {
				Random rand = new Random();
				int choice2 = 1 + rand.nextInt(2);
				if (choice2 == door) {
					//System.out.println("win");
					win = win + 1;
				} 
				
				}
			}
		
		
		return win / 10000.0;
	}

	/**
	 * 
	 * have it play the game 10,000 times and don't change door 10,000 times and
	 * change door no more than 4 lines of code
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(" Your chance of winning each time out of 10,000 times while not changing the door is: " + playGame(false));
		System.out.println(" Your chance of winning each time out of 10,000 times while changing the door is: " + playGame(true));

	}

}

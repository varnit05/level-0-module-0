
//1. Run the program.  What number appears?

//2. Make the number random.

//3. Limit the random number between 0 and 100

//4. Limit the random number between 25 and 75.  (highest value - lowest value) + lowest value

//5. Limit the random number between -222 and 88
import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		// Create an object of the Random class here
		Random jose = new Random();
		int r = jose.nextInt(88) - 22 - 88;

		System.out.println(r);
	}
}
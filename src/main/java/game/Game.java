package game;

import java.util.Random;

import aos.console.AosConsole;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random random = new Random();
		int i = random.nextInt(10);
		int j = AosConsole.readInt("Guess my number between 0 and 10 ?? :)))) ");
		if (i == j) {
			AosConsole.println(" Yeah man  :D, you are the best :D ");

		} else {
			AosConsole.println("Nooo :'(, it was " + i + " Try an others one ! :DDD ");

		}

	}
}

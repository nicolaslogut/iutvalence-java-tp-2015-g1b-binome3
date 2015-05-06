package fr.iutvalence.gunb.turnthelight;

import java.util.Scanner;

/**
 * @author dazyj
 *
 */
public class TurnOffLight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nick = askPseudo();
		Game game = new Game(nick);
		game.start();
	}
    
	/** Ask the nickname to the player and return it after the data entry. */
    private static String askPseudo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your nickname :");
        return sc.nextLine();
    }
    
    
}

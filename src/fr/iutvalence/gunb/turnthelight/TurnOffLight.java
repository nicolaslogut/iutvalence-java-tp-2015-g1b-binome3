package fr.iutvalence.gunb.turnthelight;

import java.util.Scanner;

/**
 * The execution class of the game.
 * 
 * This class allow the player to launch a game and to execute all the instructions of the program.
 * 
 * @author dazyj
 * @version 1.0
 */

public class TurnOffLight {

	/** The main function that execute the game, and launch the method start. */
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

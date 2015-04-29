package fr.iutvalence.gunb.turnthelight;

import java.util.Scanner;

/**
 * 
 * The Object that references all the data of the Player of the Game.
 * <p>
 * The player is the human entity that play to the game. 
 * So his game have some informations about his level and his capacities like the score or the number of trials.
 * When a game is created, a player is automatically created.
 *
 * @author dazyj
 * @version 1.1
 * @see Game
 *
 */
public class Player {
    /** PLayer's nickname. */
    private String nickname;
    /** The final score of the player after a game. */
    private int    scorePlayer;
    /* TODO Why here ? */
    /** The final number of trials of the player after a game. */
    private int    nbTrialsPlayer;

    /** Creation of a player with his nickname. */
    public Player(String pseudoPlayer) {
        this.nickname = pseudoPlayer;
        this.scorePlayer = 0;
        this.nbTrialsPlayer = 0;
        
    }

    /* TODO Should not be implemented here... */
    /** Ask the nickname to the player and return it after the data entry. */
    public static String askPseudo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your nickname :");
        String pseudo = sc.nextLine();
        return pseudo;
    }

    /** Save the statistics of the game of the player. */
    public void saveRecordPlayer(int score, int trials) {
        this.scorePlayer = score;
        this.nbTrialsPlayer = trials;
    }
}

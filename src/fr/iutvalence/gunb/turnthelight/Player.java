package fr.iutvalence.gunb.turnthelight;

import java.util.Scanner;

/* TODO JAVADOC. */
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
        /* TODO Initial score ? Initial nbTrialsPlayer ? */
    }

    /* TODO Should not be implemented here... */
    /** Ask the nickname to the player and return it after the data entry. */
    public static String askPseudo() {
        Scanner sc = new Scanner(System.in);
        /* TODO Translate. */
        System.out.println("Veuillez saisir votre nickname :");
        String pseudo = sc.nextLine();
        return pseudo;
    }

    /** Save the statistics of the game of the player. */
    public void saveRecordPlayer(int score, int trials) {
        this.scorePlayer = score;
        this.nbTrialsPlayer = trials;
    }
}

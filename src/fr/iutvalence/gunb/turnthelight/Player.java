package fr.iutvalence.gunb.turnthelight;

import java.util.Scanner;

public class Player 
{
	/**
	 * The pseudonym of the player. 
	 */
	private String pseudo;
	/**
	 * The final score of the player after a game.
	 */
	private int scorePlayer;
	/**
	 * The final number of trials of the player after a game.
	 */
	private int nbTrialsPlayer;
	
	/**
	 * creation of a player with is pseudonym.
	 * 
	 * @param pseudoPlayer
	 */
	public Player(String pseudoPlayer)
	{
		this.pseudo = pseudoPlayer;
	}
	
	/**
	 * Ask the pseudo to the player and return it after the data entry.
	 * 
	 * @return pseudo
	 */
	public static String askPseudo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre pseudo :");
		String pseudo = sc.nextLine();
		return pseudo;
	}
	
	/**
	 * Save the statistics of the game of the player. 
	 * 
	 * @param score
	 * @param trials
	 */
	public void saveRecordPlayer(int score, int trials)
	{
		this.scorePlayer = score;
		this.nbTrialsPlayer = trials;
	}
}

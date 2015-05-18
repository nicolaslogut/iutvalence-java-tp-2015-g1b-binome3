package fr.iutvalence.gunb.turnthelight;

import java.util.Scanner;

/**
 * Game. That is the class that contains all the game actions, executions, and informations.
 * <p>
 * A game define a grid, initialize it, and present a starting situation to the player.
 * That's the Game that define the win conditions and the game's data (number of trials, score, etc...)
 *
 * @author dazyj
 * @version 1.0
 * @see Grid
 * @see Player
 */

public abstract class Game {
    /**
     * The board game where the we will play. The most important object of the game.
     */
    protected final Grid   grid;
    /**
     * The player of the Game. It will allow to register the best records.
     */
    private final Player player;
    /**
     * A boolean that define if the game is ended or not.
     */
    private boolean gameIsWon = false;
    /**
     * The number of changements of light's states. It will help to define the score of the player.
     */
    private int nbTrials;

    /**
     * Game creation. Using in parameters the grid and the player.
     * We create the grid of the game and the player with his pseudo.
     *
     * @see Grid
     * @see Player
     */
    protected Game(String nickname) {
        this.grid = new Grid();
        this.player = new Player(nickname);
        this.nbTrials = 0;
    }

    /**
     * Ask the Absciss of a light.
     * It is a function which is used to ask to the player the absciss of the light he wants to swap.
     *  
     * @return
     */
    
    private static int askAbsciss() {
    	Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the absciss of the light you want switch :");
        return sc2.nextInt();
    }

    /**
     * Ask the Ordinate of a light.
     * It is a function which is used to ask to the player the ordinate of the light he wants to swap.
     * @return
     */
    private static int askOrdinate() {
    	Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the ordinate of the light you want switch :");
        return sc2.nextInt();
    }
    
    public abstract void initialisation();
	/**
     * Start the game.
     */
	public void start() {
        System.out.println(grid);
        initialisation();
        System.out.println(grid);
        while (this.gameIsWon == false){
        	int xAsk = askAbsciss();
        	int yAsk = askOrdinate();
        	grid.swap(xAsk, yAsk);
        	grid.changeAdjacentLightState(xAsk, yAsk);
        	System.out.println(grid);
        	this.nbTrials++;
        	if (grid.testGrid() == true){
        		this.gameIsWon = true;
        		System.out.println("You won the game !");
        		System.out.println("Score = ");
        		System.out.println(this.nbTrials);
        	}        	
        
        }	

    }
}

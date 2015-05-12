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

public class Game {
    /**
     * The board game where the we will play. The most important object of the game.
     */
    private final Grid   grid;
    // TODO Lots of unused fields…
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
     * The score of the player. It ranks the different players with their number of trials (and maybe their game time).
     */
    private int score;

    /**
     * Game creation. Using in parameters the grid and the player.
     * We create the grid of the game and the player with his pseudo.
     *
     * @see Grid
     * @see Player
     */
    public Game(String nickname) {
        this.grid = new Grid();
        this.player = new Player(nickname);
        this.nbTrials = 0;
        this.score = 0;
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

    /**
     * Initialize all the lights of the grid for the start situation and switch them on.
     */
    private void initialisation() {
        grid.swap(0, 1);
        grid.swap(1, 0);
        grid.swap(0, 0);
    }

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
        	if (grid.testGrid() == true){
        		this.gameIsWon = true;
        		System.out.println("You win the game !");
        	}        	
        
        }	

    }
}

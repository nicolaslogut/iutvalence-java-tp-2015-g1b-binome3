package fr.iutvalence.gunb.turnthelight;

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
    private       int    nbTrials;
    /**
     * The score of the player. It ranks the different players with their number of trials (and maybe their game time).
     */
    private       int    score;

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
    
    
    public void initialisation(){
        grid.swap(0, 0);
    }
    
    public void start()	{
    	System.out.println(grid);
        initialisation();
    	System.out.println(grid);

    	
    	
    	/* TODO donner la main au joueur et agir en fonction de ses clics */
    	/* TODO vérifier après chaque coup si la partie est gagnée ou non */
    }
}

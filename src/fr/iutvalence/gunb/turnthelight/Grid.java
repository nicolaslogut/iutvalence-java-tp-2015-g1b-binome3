package fr.iutvalence.gunb.turnthelight;

/**
 * Support principal du jeu. C'est le type d'objets au dessus du Groupe dans l'échelle des objets.
 * <p>
 * Dans chaque emplacement de la grille on a une Lampe.
 * Le nombre de lampe dans la grille varie selon la taille de celle-ci.
 *
 * @see Light
 */
public class Grid {
	/**
	 * The constants that define the size of the grid in lines and columns, and help to define the groups of the lights. 
	 * 
	 * @see Light
	 */
    public static final int NB_LINES        = 5;

    public static final int NB_COLUMNS      = 5;
    /**
     * The number of lights in the grid.
     */
    public static final int NB_GRID_LIGHTS = NB_LINES * NB_COLUMNS;
    
    /**
     * Creation of the grid. We create a table with 2 entries, which contain the lights that will be use in the game.
     */
    public Grid()
    {
    	Light gridOfLights[][] = new Light[this.NB_LINES][this.NB_COLUMNS];    	
    }
}



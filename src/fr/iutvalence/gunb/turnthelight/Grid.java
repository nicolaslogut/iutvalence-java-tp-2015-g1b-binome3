package fr.iutvalence.gunb.turnthelight;

import java.util.Arrays;

/* TODO Translate. */
/**
 * Support principal du jeu. C'est le type d'objets au dessus du Groupe dans l'échelle des objets.
 * <p>
 * Dans chaque emplacement de la grille on a une Lampe.
 * Le nombre de lampe dans la grille varie selon la taille de celle-ci.
 *
 * @author dazyj
 * @version 1.0
 * @see Light
 */
public class Grid {
	/** TODO. */
	public static final int NB_LINES       = 5;
	/** TODO. */
	public static final int NB_COLUMNS     = 5;
    /** The number of lights in the grid. */
    public static final int NB_GRID_LIGHTS = NB_LINES * NB_COLUMNS;
    /** TODO. */
    private Light gridOfLights[][];

    /**
     * Creation of the grid. We create a table with 2 entries, which contain the lights that will be use in the game.
     */
    public Grid() {
        gridOfLights = new Light[this.NB_LINES][this.NB_COLUMNS];
      
        for (int i=0; i<this.NB_LINES; i++){
        	for (int j=0; j<this.NB_COLUMNS; j++){
        		gridOfLights[i][j] = new Light(false, i, j);
        	}
        }        
    }
    
    public void swap(int x, int y) {
    	gridOfLights[x][y].changeLightState();
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < NB_LINES; i++) {
    		sb.append(Arrays.toString(gridOfLights[i])).append('\n');
    	}
    	return sb.toString();
    }
}



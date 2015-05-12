package fr.iutvalence.gunb.turnthelight;

import java.util.Arrays;

/**
 * Main support of the game. That is the object that allow the player to play the game with graphics properties.
 * The grid is an important element of the game's structure.
 * <p>
 * In each case of the grid, there is a light.
 * The number of lights in the grid is varying with the size of it.
 *
 * @author dazyj
 * @version 1.0
 * @see Light
 */
public class Grid {
	/** The number of lines of the grid. */
    public static final int NB_LINES       = 5;
    /** The number of columns of the grid. */
    public static final int NB_COLUMNS     = 5;
    /** The number of lights in the grid. */
    public static final int NB_GRID_LIGHTS = NB_LINES * NB_COLUMNS;
    /** A table of lights, that represents the grid. */
    private final Light[][] gridOfLights;

    /**
     * Creation of the grid.
     * <p>
     * We create a table with 2 entries, which contain the lights that will be use in the game.
     */
    
    public Grid() {
        gridOfLights = new Light[NB_LINES][NB_COLUMNS];

        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                /* TODO Why specify the initial state in the constructor if it's always "false" */
                gridOfLights[i][j] = new Light(false, i, j);
            }
        }
    }

    /**
     * Change the state of a light that is situated precisely in the Grid.
     * x = the absciss of the light.
     * y = the ordinate of the light.
     * 
     * @param x
     * @param y
     */
    
    public void swap(int x, int y) {
        gridOfLights[x][y].changeLightState();
    }

    /**
     * Change the state of all the adjacent lights of the main light (specified in parameter)
     * xMainLight = the absciss of the main light 
     * yMainLight = the ordinate of the main light
     * 
     * @param xMainLight
     * @param yMainLight
     */
    
    public void changeAdjacentLightState(int xMainLight, int yMainLight) {
        /* TODO This algorithm is really really *really* bad… */
        if (gridOfLights[xMainLight][yMainLight].getTheGroup() == Light.Corner) {
            int count = 0;
            while (count < gridOfLights[xMainLight][yMainLight].getTheGroup().getTheNbOfAdjacentLights()) {
                if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight + 1, yMainLight);
                    count++;
                }
                if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight - 1, yMainLight);
                    count++;
                }
                if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= NB_COLUMNS)) {
                    swap(xMainLight, yMainLight + 1);
                    count++;
                }
                if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= NB_COLUMNS)) {
                    swap(xMainLight, yMainLight - 1);
                    count++;
                }
            }
        }
        if (gridOfLights[xMainLight][yMainLight].getTheGroup() == Light.Edge) {
            int count = 0;
            while (count < gridOfLights[xMainLight][yMainLight].getTheGroup().getTheNbOfAdjacentLights()) {
                if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight + 1, yMainLight);
                    count++;
                }
                if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight - 1, yMainLight);
                    count++;
                }
                if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= NB_COLUMNS)) {
                    swap(xMainLight, yMainLight + 1);
                    count++;
                }
                if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= NB_COLUMNS)) {
                    swap(xMainLight, yMainLight - 1);
                    count++;
                }
            }
        }
        if (gridOfLights[xMainLight][yMainLight].getTheGroup() == Light.Center) {
            int count = 0;
            while (count < gridOfLights[xMainLight][yMainLight].getTheGroup().getTheNbOfAdjacentLights()) {
                if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight + 1, yMainLight);
                    count++;
                }
                if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight - 1, yMainLight);
                    count++;
                }
                if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= NB_COLUMNS)) {
                    swap(xMainLight, yMainLight + 1);
                    count++;
                }
                if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= NB_COLUMNS)) {
                    swap(xMainLight, yMainLight - 1);
                    count++;
                }
            }
        }
    }
    
    /**
     * Test the "state" of the grid. We verify the state of all the lights in the grid.
     * If the grid is full of lights switched OFF, the method returns true.
     * Else the method return false.
     * 
     * @return
     */
    
    public boolean testGrid() {
    	int count = 0;
    	for (int i = 0; i < NB_LINES; i++){
    		for (int j = 0; j < NB_COLUMNS; j++){
    			if (gridOfLights[i][j].isOn){
    				count++;
    			}
    		}
    	}
    	if (count == 0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }

    @Override
    public String toString() {
        // TODO Put an initial size
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NB_LINES; i++) {
            sb.append(Arrays.toString(gridOfLights[i])).append('\n');
        }
        return sb.toString();
    }
}



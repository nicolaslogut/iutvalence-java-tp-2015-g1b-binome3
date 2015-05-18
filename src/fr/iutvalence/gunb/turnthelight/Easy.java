package fr.iutvalence.gunb.turnthelight;
import java.lang.Math;

public class Easy extends Game {

	
	public Easy(String nickname) {
		super(nickname);
	}
	
	/**
     * Initialize all the lights of the grid for the start situation and switch them on.
     */
	public void initialisation() {
		/** The random absciss to generate a light at the initialization. */
        int xRand;
        
        /** The random ordinate to generate a light at the initialization. */
        int yRand;
        
        /** The  number of light to generate at the initialization. */
        int nbRand = 5;
        
        /** The counter of lights that has been initialized. */
        int counter = 0;
        
        /*while (counter <= nbRand){*/
        	xRand = ((int) Math.random()) * (Grid.NB_LINES);
        	yRand = ((int) Math.random()) * (Grid.NB_COLUMNS);
        	if(grid.testLight(xRand, yRand)){
        		grid.swap(xRand, yRand);
        		/*counter++;*/
        	}
        	
       /* }*/
        
        
        
    }
}

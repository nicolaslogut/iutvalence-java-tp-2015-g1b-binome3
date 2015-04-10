package fr.iutvalence.gunb.turnthelight;

/**
 * The main object of the game. All the game is made around the lights.
 * <p>
 * A light class can create objects which are into each case of the grid.
 * A light can be switched ON or OFF and can change his state.
 * A light is situated in a group that depends of his position in the grid.
 *
 * @author dazyj
 * @version 1.0
 * @see Group
 * @see Grid
 */
public class Light {
	
	/**
	 *We define the two states available to a light :
	 *ON or OFF. 
	 */
    public static final boolean ON = true;
    
    public static final boolean OFF = false;
    /** current state */
    private final boolean isOn;
    
    private final Group groupOfTheLight;


    /**
     * light creation.
     * <p>
     * We use in parameters the initial state of the light and his position in the grid (linePosition, columnPosition)
     */
    public Light(boolean lightState, int x, int y) 
    {
        isOn = lightState;
        if (((x == 0) && (y == 0)) || ((x == Grid.NB_LIGNES - 1) && (y == 0)) || ((x == 0) && )  )
        {
        	
        }
    }

    /**
     * Change the state of the light.
     * <p>
     * The light is ON if she was OFF and OFF if it was ON.
     */
    public void changerEtatLampe() {
    }
}

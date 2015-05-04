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
    private boolean isOn;
    /** */
    private Group groupOfTheLight;
    /** */
    private Group Corner = new Group(GroupType.CORNER);
    /** */
    private Group Edge = new Group(GroupType.EDGE);
    /** */
    private Group Center = new Group(GroupType.CENTER);


    /**
     * light creation.
     * <p>
     * We use in parameters the initial state of the light and his position in the grid (linePosition, columnPosition)
     * The position of the light will define his group.
     * 
     * @see Group
     * @see GroupType
     * @param lightState, x, y
     */
    public Light(boolean lightState, int x, int y) 
    {
        this.isOn = lightState;
        if (((x == 0) && (y == 0)) || ((x == Grid.NB_LINES - 1) && (y == 0)) || ((x == 0) && (y == Grid.NB_COLUMNS - 1)) || ((x == Grid.NB_LINES - 1) && (y == Grid.NB_COLUMNS - 1)))
        {
        	this.groupOfTheLight = Corner;
        }
        else
        {
        	if (((x == 0) && (y != 0) && (y != Grid.NB_COLUMNS - 1)) || ((x == Grid.NB_LINES - 1) && (y != 0) && (y != Grid.NB_COLUMNS - 1)) || ((y == 0) && (x != 0) && (x != Grid.NB_COLUMNS - 1)) || ((y == Grid.NB_LINES - 1) && (x != 0) && (x != Grid.NB_COLUMNS - 1)) )
        	{	
        		this.groupOfTheLight = Edge;
        	}
        	else
        	{
        		this.groupOfTheLight = Center;
        	}
        }
    }

    /**
     * Change the state of the light.
     * <p>
     * The light is ON if she was OFF and OFF if it was ON.
     */
    public void changeLightState() 
    {
    	this.isOn = !this.isOn;
    }
    
    public void changeAdjacentLightState(int xMainLight, int yMainLight){
    	if (this.groupOfTheLight == Corner){
    		int count = 0;
    		while (count < this.groupOfTheLight.getTheNbOfAdjacentLights()){
    			if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= Grid.NB_LINES)){
    				
    			}
    			if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= Grid.NB_LINES)){
    				
    			}
    			if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= Grid.NB_LINES)){
    				
    			}
    			if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= Grid.NB_LINES)){
    				
    			}
    			
    		}
    	}
    }
    
    public String toString() {
    	return isOn ? "O" : "X";
    }
}

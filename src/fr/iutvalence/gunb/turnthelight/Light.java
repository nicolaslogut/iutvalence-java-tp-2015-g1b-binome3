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
    /* TODO JAVADOC. */
    public static final boolean ON     = true;
    /* TODO JAVADOC. */
    public static final boolean OFF    = false;
    /* TODO I really don't understand these Groupe… */
    /** The variable corresponding to the group of lights in the corners. */
    public static       Group   Corner = new Group(GroupType.CORNER);
    /** The variable corresponding to the group of lights in the edges. */
    public static       Group   Edge   = new Group(GroupType.EDGE);
    /** The variable corresponding to the group of lights in the center. */
    public static       Group   Center = new Group(GroupType.CENTER);
    /** Current state. */
    private boolean isOn;
    /** The group where is situated the light. */
    private Group   groupOfTheLight;

    /**
     * light creation.
     * <p>
     * We use in parameters the initial state of the light and his position in the grid (linePosition, columnPosition)
     * The position of the light will define his group.
     *
     * @param lightState, x, y
     *
     * @see Group
     * @see GroupType
     */
    public Light(boolean lightState, int x, int y) {
        this.isOn = lightState;

        if (((x == 0) && (y == 0)) || ((x == (Grid.NB_LINES - 1)) && (y == 0)) ||
            ((x == 0) && (y == (Grid.NB_COLUMNS - 1))) ||
            ((x == (Grid.NB_LINES - 1)) && (y == (Grid.NB_COLUMNS - 1)))) {
            this.groupOfTheLight = Corner;
        }
        else {
            if (((x == 0) && (y != 0) && (y != Grid.NB_COLUMNS - 1)) ||
                ((x == Grid.NB_LINES - 1) && (y != 0) && (y != Grid.NB_COLUMNS - 1)) ||
                ((y == 0) && (x != 0) && (x != Grid.NB_COLUMNS - 1)) ||
                ((y == Grid.NB_LINES - 1) && (x != 0) && (x != Grid.NB_COLUMNS - 1))) {
                this.groupOfTheLight = Edge;
            }
            else {
                this.groupOfTheLight = Center;
            }
        }
    }

    // TODO Simplify your method name: swap?
    /**
     * Change the state of the light.
     * <p>
     * The light is ON if she was OFF and OFF if it was ON.
     */
    public void changeLightState() {
        this.isOn = !this.isOn;
    }

    // TODO Simplify your method name: group?
    public Group getTheGroup() {
        return this.groupOfTheLight;
    }

    public String toString() {
        return isOn ? "O" : "X";
    }
}

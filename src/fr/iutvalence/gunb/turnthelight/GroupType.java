package fr.iutvalence.gunb.turnthelight;

/**
 * Object necessary to the group definition. 
 * <p>
 * The class "GroupType" define the differents types of groups that exists.
 * Each type of group is defined with the number of adjacent lights available to the lights which compose it.
 * This class is used in group to access to the information concerning the type of the group and to give them to the object group.
 *
 * @author dazyj
 * @version 1.0
 * @see Group
 */
public enum GroupType {
	/** The group of the lights that are situated in the corners of the Grid. Each light have 2 adjacent lights. */
    CORNER(2),
    /** The group of the lights that are situated in the edges of the Grid. Each light have 3 adjacent lights. */
    EDGE(3),
    /** The group of the lights that are situated in the center of the Grid. Each light have 4 adjacent lights. */
    CENTER(4);

    /** Number of adjacent lights. */
    private final int nbLightAdjacent;

    /** Creation of a GroupType depending of the number of the adjacent lights. */
    GroupType(int lightNb) {
        this.nbLightAdjacent = lightNb;
    }

    /** Get the number of adjacent lights of a GroupType. */
    public int getNbLightAdjacent() {
        return this.nbLightAdjacent;
    }
}

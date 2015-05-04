package fr.iutvalence.gunb.turnthelight;

/**
 * Object necessary to the state's changes. A light belongs to a group.
 * <p>
 * The class "group" define the objects which characterizes the state changes of a light.
 * It exists 3 types of lights, because of the differences that they show when they change their states.
 * We have lights that have 2 lights around of them which change at the same time. They are positioned in the corners of the grid.
 * We have lights that have 3 lights around of them which change at the same time. They are positioned in the edges of the grid.
 * We have lights that have 4 lights around of them which change at the same time. They are positioned everywhere else.
 * To define how many lights must change their state at the same time, we create a group for each case.
 *
 * @author dazyj
 * @version 1.0
 * @see Light
 */
public class Group {
    /**
     * The type of the group, which define the number of adjacents lights.
     *
     * @see GroupType
     */
    private GroupType typeOfTheGroup;
    /* TODO NbLights is linked to GroupType and obtain from it… Why use this class and not directly GroupType ? */
    /* TODO JAVADOC. */
    private int       nbLights;

    /**
     * Creation of the group, using his GroupType.
     *
     * @see GroupType
     */
    public Group(GroupType type) {
        this.typeOfTheGroup = type;
        this.nbLights = type.getNbLightAdjacent();
    }

    /**
     * Get the GroupType of a Group.
     *
     * @return typeOfTheGroup
     *
     * @see GroupType
     */
    public GroupType getTheGroup() {
        return this.typeOfTheGroup;
    }

    /**
     * Get the number of adjacent lights of a Group.
     *
     * @return nbLights
     */
    public int getTheNbOfAdjacentLights() {
        return this.nbLights;
    }
}

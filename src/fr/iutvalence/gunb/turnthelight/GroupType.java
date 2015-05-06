package fr.iutvalence.gunb.turnthelight;

/* TOOD JAVADOC. */
public enum GroupType {
    /* TODO JAVADOC. */
    CORNER(2),
    /* TODO JAVADOC. */
    EDGE(3),
    /* TODO JAVADOC. */
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

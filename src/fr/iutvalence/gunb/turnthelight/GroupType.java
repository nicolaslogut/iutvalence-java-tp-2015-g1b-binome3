package fr.iutvalence.gunb.turnthelight;

/* TOOD JAVADOC. */
public enum GroupType 
{
	/* TODO JAVADOC can't be applied to several fields at once. */
	/**
	 * We define the type of the group.
	 * group "CORNER" : 2 adjacent lights
	 * group "EDGE" : 3 adjacent lights
	 * group "CENTER" : 4 adjacent lights
	 */
	CORNER(2),
	EDGE(3),
	CENTER(4);
	
	/** Number of adjacent lights. */
	private final int nbLightAdjacent;

	/** Creation of a GroupType depending of the number of the adjacent lights. */
	private GroupType(int lightNb) {
		this.nbLightAdjacent = lightNb;
	}

	/** Get the number of adjacent lights of a GroupType. */
	public int getNbLightAdjacent() {
		return this.nbLightAdjacent;
	}
}

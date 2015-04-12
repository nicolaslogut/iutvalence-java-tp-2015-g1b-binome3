package fr.iutvalence.gunb.turnthelight;

public enum GroupType 
{
	/**
	 * We define the type of the group.
	 * group "CORNER" : 2 adjacent lights
	 * group "EDGE" : 3 adjacent lights
	 * group "CENTER" : 4 adjacent lights
	 */
	CORNER(2),
	EDGE(3),
	CENTER(4);
	
	/**
	 * the main attribute of the type of the group : the number of adjacent lights.
	 */
	private int nbLightAdjacent;
	/**
	 * creation of a GroupType depending of the number of the adjacent lights.
	 * 
	 * @param lightNb
	 */
	private GroupType(int lightNb)
	{
		this.nbLightAdjacent = lightNb;
	}
	
	/**
	 *get the number of adjacent lights of a GroupType. 
	 *
	 * @return nbLightAdjacent
	 */
	public int getNbLightAdjacent()
	{
		return this.nbLightAdjacent;
	}
}

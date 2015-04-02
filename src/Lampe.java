
	/**
	 * Objet principal du jeu, la lampe est en bas de l'échelle des objets.
	 * 
	 * La classe Lampe est l'objet qui sera contenu dans chaque emplacement de la grille.
	 * Une lampe peut être allumée ou éteinte et peut changer d'état. 
	 * Une lampe est située dans un Groupe suivant sa position dans la Grille.
	 *
	 * @see Groupe
	 * @see Grille
	 * 
	 * @param estAllumee 
	 * 			C'est ce qui définit l'état courant de la lampe (allumé OU éteint)
	 * 
	 * 
	 * 
	 */

public class Lampe 
{
	
	public final static boolean ALLUMEE = true;
	public final static boolean ETEINTE = false;
	
	private boolean estAllumee;
	
	public Lampe(boolean etatLampe)
	{
		this.estAllumee = etatLampe;
	}
	
	public void changerEtatLampe()
	{

	}
}

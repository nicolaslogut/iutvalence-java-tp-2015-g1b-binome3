package fr.iutvalence.gunb.turnthelight;

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
	 */

public class Lampe 
{
	
	public final static boolean ALLUMEE = true;
	public final static boolean ETEINTE = false;
	
	/**
	 * Constantes correspondant aux états "allumé" ou "éteint".
	 */
	
	private boolean estAllumee;
	
	/**
	 * Etat courant.
	 */
	
	private int positionLigne;
	
	/**
	 * Abscisse de la position dans la grille de jeu.
	 */
	
	private int positionColonne;
	
	/**
	 * Ordonnée de la position dans la grille de jeu. 
	 */
	
	public Lampe(boolean etatLampe, int x, int y)
	{
		this.estAllumee = etatLampe;
		this.positionLigne = x;
		this.positionColonne = y;
	}
	
	/**
	 * Création d'une lampe.
	 * On prend en paramètre son état initial, et sa position dans la grille (x et y).
	 */
	
	public void changerEtatLampe()
	{

	}
	
	/**
	 * On change d'état. La lampe passe allumée si elle était éteinte et éteinte si elle était allumée. 
	 */
}

package fr.iutvalence.gunb.turnthelight;

	/**
	 * Objet nécessaire aux changements d'état, le groupe est juste au dessus de la Lampe dans l'échelle des objets.
	 * 
	 * La classe Groupe définit des objets servant de références à certaines Lampes.
	 * Selon leur position dans la grille, chaque lampe a 2, 3 ou 4 lampes adjacentes qui changeront d'état en même temps qu'elle.
	 * Il faut un groupe par nombre de lampes adjacentes pour pouvoir bien définir les différents cas.
	 *  
	 *
	 * @see Lampe
	 * 
	 */

public class Groupe 
{
	private String typeGroupe;
	private int nbLampesAdjacentes;
	
	public Groupe(String nom, int nb)
	{
		this.typeGroupe = nom;
		this.nbLampesAdjacentes = nb;		
	}	
	
}

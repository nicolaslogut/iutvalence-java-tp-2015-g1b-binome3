package fr.iutvalence.gunb.turnthelight;

/**
 * Support principal du jeu. C'est le type d'objets au dessus du Groupe dans l'échelle des objets.
 * 
 * Dans chaque emplacement de la grille on a une Lampe.
 * Le nombre de lampe dans la grille varie selon la taille de celle-ci.
 *
 * @see Lampe
 * 
 */

public class Grille 
{
	public final static int NB_LIGNES = 5;
	public final static int NB_COLONNES = 5;
	public final static int NB_LAMPES_GRILLE = NB_LIGNES * NB_COLONNES;
	
}

package fr.iutvalence.gunb.turnthelight;

/**
 * Objet permettant de jouer. C'est le type d'ojbets le plus haut dans la hiérarchie des objets.
 * 
 * Une partie permet de définir une Grille, de l'initialiser et de prtésenter une situation de départ au joueur. 
 * C'est égalemet la partie qui définit les conditions pour remporter le jeu et qui contient les données de jeu comme le score, le nombre de coups, etc...
 * 
 *
 * @see Grille
 * 
 */

public class Partie 
{
	
	private boolean partieGagnee = false;
	private Grille grilleDeBase;
	
	public Partie()
	{
		
	}
	
	
}

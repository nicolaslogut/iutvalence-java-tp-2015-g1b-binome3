package fr.iutvalence.gunb.turnthelight;

/* TODO Outre la javadoc à reprendre… je ne la comprends pas qu'entendez vous par "au dessus du Groupe dans l'échelle
 * des objets ??? Parce que votre Grille doit contenir des lampes si j'ai bien compris ce qui est écrit en dessous.
 */
/**
 * Support principal du jeu. C'est le type d'objets au dessus du Groupe dans l'échelle des objets.
 * <p>
 * Dans chaque emplacement de la grille on a une Lampe.
 * Le nombre de lampe dans la grille varie selon la taille de celle-ci.
 *
 * @see Light
 */
public class Grid {
    /* TODO JAVADOC. */
    public static final int NB_LIGNES        = 5;
    /* TODO JAVADOC. */
    public static final int NB_COLONNES      = 5;
    /* TODO JAVADOC. */
    public static final int NB_LAMPES_GRILLE = NB_LIGNES * NB_COLONNES;
    /* TODO Où est la grille ? */
}

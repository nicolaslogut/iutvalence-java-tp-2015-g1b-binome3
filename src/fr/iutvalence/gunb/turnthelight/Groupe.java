package fr.iutvalence.gunb.turnthelight;

/* TODO L'intérêt de cette classe est un peu obscure pour moi. À discuter en TP ou en commentaire… */
/**
 * Objet nécessaire aux changements d'état, le groupe est juste au dessus de la Lampe dans l'échelle des objets.
 * <p>
 * La classe Groupe définit des objets servant de références à certaines Lampes.
 * Selon leur position dans la grille, chaque lampe a 2, 3 ou 4 lampes adjacentes qui changeront d'état en même temps qu'elle.
 * Il faut un groupe par nombre de lampes adjacentes pour pouvoir bien définir les différents cas.
 *
 * @author TODO
 * @version TODO
 * @see Lampe
 */
public class Groupe {
    /* TODO JAVADOC. */
    private String typeGroupe;
    /* TODO JAVADOC. */
    private int    nbLampesAdjacentes;
    /* TODO Et il n'y a pas de lampes dnas le groupe ??? */

    /* TODO JAVADOC. */
    public Groupe(String nom, int nb) {
        this.typeGroupe = nom;
        this.nbLampesAdjacentes = nb;
    }
}

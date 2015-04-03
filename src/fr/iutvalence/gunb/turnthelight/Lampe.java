package fr.iutvalence.gunb.turnthelight;

/**
 * Objet principal du jeu, la lampe est en bas de l'échelle des objets.
 * <p>
 * La classe Lampe est l'objet qui sera contenu dans chaque emplacement de la grille.
 * Une lampe peut être allumée ou éteinte et peut changer d'état.
 * Une lampe est située dans un Groupe suivant sa position dans la Grille.
 *
 * @author TODO
 * @version TODO
 * @see Groupe
 * @see Grille
 */
public class Lampe {
    /* TODO Pourquoi pas un enum ? */
    /* TODO JAVADOC. */
    public static final boolean ALLUMEE = true;
    /* TODO JAVADOC. */
    public static final boolean ETEINTE = false;
    /* TODO final ??? Vous êtes sur ??? */
    /** Etat courant. */
    private final boolean estAllumee;
    /** Ordonnée de la position dans la grille de jeu. */
    private final int     positionLigne;
    /** Abscisse de la position dans la grille de jeu. */
    private final int     positionColonne;

    /**
     * Création d'une lampe.
     * <p>
     * TODO Utiliser la syntaxe appropriée pour la ligne ci-dessous.
     * On prend en paramétre son état initial, et sa position dans la grille (x et y).
     */
    public Lampe(boolean etatLampe, int x, int y) {
        estAllumee = etatLampe;
        positionLigne = x;
        positionColonne = y;
    }

    /**
     * Changer l'état de la lampe.
     * <p>
     * La lampe passe allumée si elle était éteinte et éteinte si elle était allumée.
     */
    public void changerEtatLampe() {
    }
}

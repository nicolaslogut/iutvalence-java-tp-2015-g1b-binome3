package fr.iutvalence.gunb.turnthelight;

import java.util.Arrays;

/* TODO Translate. */

/**
 * Support principal du jeu. C'est le type d'objets au dessus du Groupe dans l'échelle des objets.
 * <p>
 * Dans chaque emplacement de la grille on a une Lampe.
 * Le nombre de lampe dans la grille varie selon la taille de celle-ci.
 *
 * @author dazyj
 * @version 1.0
 * @see Light
 */
public class Grid {
    /** TODO. */
    public static final int NB_LINES       = 5;
    /** TODO. */
    public static final int NB_COLUMNS     = 5;
    /* TODO unused? */
    /** The number of lights in the grid. */
    public static final int NB_GRID_LIGHTS = NB_LINES * NB_COLUMNS;
    /** TODO. */
    private final Light[][] gridOfLights;

    /**
     * Creation of the grid.
     * <p>
     * We create a table with 2 entries, which contain the lights that will be use in the game.
     */
    public Grid() {
        gridOfLights = new Light[NB_LINES][NB_COLUMNS];

        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                /* TODO Why specify the initial state in the constructor if it's always "false" */
                gridOfLights[i][j] = new Light(false, i, j);
            }
        }
    }

    /* TODO JAVADOC. */
    public void swap(int x, int y) {
        gridOfLights[x][y].changeLightState();
    }

    /* TODO Use another name closer to swap. */
    /* TODO JAVADOC */
    public void changeAdjacentLightState(int xMainLight, int yMainLight) {
        /* TODO This algorithm is really really *really* bad… */
        if (gridOfLights[xMainLight][yMainLight].getTheGroup() == Light.Corner) {
            int count = 0;
            while (count < gridOfLights[xMainLight][yMainLight].getTheGroup().getTheNbOfAdjacentLights()) {
                if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight + 1, yMainLight);
                    count++;
                }
                if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight - 1, yMainLight);
                    count++;
                }
                if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight, yMainLight + 1);
                    count++;
                }
                if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight, yMainLight - 1);
                    count++;
                }
            }
        }
        if (gridOfLights[xMainLight][yMainLight].getTheGroup() == Light.Edge) {
            int count = 0;
            while (count < gridOfLights[xMainLight][yMainLight].getTheGroup().getTheNbOfAdjacentLights()) {
                if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight + 1, yMainLight);
                    count++;
                }
                if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight - 1, yMainLight);
                    count++;
                }
                if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight, yMainLight + 1);
                    count++;
                }
                if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight, yMainLight - 1);
                    count++;
                }
            }
        }
        if (gridOfLights[xMainLight][yMainLight].getTheGroup() == Light.Center) {
            int count = 0;
            while (count < gridOfLights[xMainLight][yMainLight].getTheGroup().getTheNbOfAdjacentLights()) {
                if (((xMainLight + 1) >= 0) && ((xMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight + 1, yMainLight);
                    count++;
                }
                if (((xMainLight - 1) >= 0) && ((xMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight - 1, yMainLight);
                    count++;
                }
                if (((yMainLight + 1) >= 0) && ((yMainLight + 1) <= NB_LINES)) {
                    swap(xMainLight, yMainLight + 1);
                    count++;
                }
                if (((yMainLight - 1) >= 0) && ((yMainLight - 1) <= NB_LINES)) {
                    swap(xMainLight, yMainLight - 1);
                    count++;
                }
            }
        }
    }

    @Override
    public String toString() {
        // TODO Put an initial size
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NB_LINES; i++) {
            sb.append(Arrays.toString(gridOfLights[i])).append('\n');
        }
        return sb.toString();
    }
}



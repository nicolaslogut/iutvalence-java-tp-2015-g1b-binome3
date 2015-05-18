package fr.iutvalence.gunb.turnthelight;

/**
 * The Object that references all the data of the Player of the Game.
 * <p>
 * The player is the human entity that play to the game.
 * So his game have some informations like his nickname.
 * When a game is created, a player is automatically created.
 *
 * @author dazyj
 * @version 1.1
 * @see Game
 */
public class Player {
    /** PLayer's nickname. */
    private String nickname;

    /** Creation of a player with his nickname. */
    public Player(String pseudoPlayer) {
        this.nickname = pseudoPlayer;
    }

}

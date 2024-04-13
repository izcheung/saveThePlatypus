package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.input.KeyEvent;


/**
 * Defines the behavior for a player character in the game.
 *
 * @author Irene Cheung
 * @version 2024
 */
public interface PlayerBehavior {

    /**
     * Processes the key press event to control the player character.
     *
     * @param event The key event representing the key press.
     */
    void processKeyPress(final KeyEvent event);
}

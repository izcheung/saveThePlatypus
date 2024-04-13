package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.Group;
import javafx.scene.shape.Circle;

import java.util.Random;

/**
 * Represents an enemy that moves horizontally across the game screen.
 *
 * @author Irene Cheung
 * @version 2024
 */
public class HorizontalEnemy extends Enemy {

    /**
     * Sets the specific movement direction for the horizontal enemy.
     *
     * @param root   The root group of the game scene.
     * @param circle The circle representing the enemy.
     */
    protected void setSpecificMovementDirection(Group root, Circle circle) {
        translateTransition.setByY(Run.APP_HEIGHT + 50);
    }

    /**
     * Creates a circle representing the horizontal enemy.
     *
     * @return The circle representing the horizontal enemy.
     */
    @Override
    public Circle createCircle() {
        Random RANDOM = new Random();
        return new Circle(RANDOM.nextInt(Run.APP_WIDTH), -25, 25);
    }

}

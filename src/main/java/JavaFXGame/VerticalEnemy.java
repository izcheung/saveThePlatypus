package JavaFXGame;

import javafx.scene.Group;
import javafx.scene.shape.Circle;

import java.util.Random;

/**
 * Represents an enemy that moves vertically across the screen.
 * @author Irene Cheung
 * @version 2024
 */
public class VerticalEnemy extends Enemy {

    /**
     * Sets the specific movement direction for the vertical enemy.
     *
     * @param root   The root group of the game scene.
     * @param circle The circle representing the enemy.
     */
    public void setSpecificMovementDirection(Group root, Circle circle) {
        translateTransition.setByX(Run.APP_WIDTH + 50);
    }

    /**
     * Creates a circle representing the vertical enemy.
     *
     * @return The circle representing the vertical enemy.
     */
    @Override
    public Circle createCircle() {
        Random RANDOM = new Random();
        return new Circle(-25, RANDOM.nextInt(Run.APP_HEIGHT), 25);
    }
}



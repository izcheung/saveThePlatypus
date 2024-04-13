package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

/**
 * Defines methods for collision detection and handling.
 *
 * @author Irene Cheung
 * @version 2024
 */
public interface Collision {

    /**
     * Moves an object represented by a circle within a group.
     *
     * @param group The group containing the object.
     * @param circle The circle representing the object to be moved.
     */
    void move(Group group, Circle circle);

    /**
     * Checks for collision between an image view and a circle within a group.
     *
     * @param imageView The image view representing the player or another object.
     * @param circle The circle representing the enemy or another object.
     * @param group The group containing the objects to be checked for collision.
     */
    void checkCollision(ImageView imageView, Circle circle, Group group);
}

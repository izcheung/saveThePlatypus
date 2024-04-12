package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public interface Collision {
    void move(Group group, Circle circle);
    void checkCollision(ImageView imageView, Circle circle, Group group);
}

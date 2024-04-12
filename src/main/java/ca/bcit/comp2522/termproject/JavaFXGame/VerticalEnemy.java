package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class VerticalEnemy extends Enemy {

    public void setSpecificMovementDirection(Group root, Circle circle) {
        translateTransition.setByX(Run.APP_WIDTH + 50);
    }

    @Override
    public Circle createCircle() {
        return new Circle(-25, RANDOM.nextInt(Run.APP_HEIGHT), 25);
    }

}

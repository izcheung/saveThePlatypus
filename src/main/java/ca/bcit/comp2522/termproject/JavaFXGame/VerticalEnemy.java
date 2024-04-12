package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.Group;
import javafx.scene.shape.Circle;

public class VerticalEnemy extends Enemy {
    protected void setSpecificMovementDirection(Group root, Circle circle) {
        translateTransition.setByX(Run.APP_WIDTH + 50);
    }
    @Override
    public Circle createCircle() {
        return new Circle(-25, RANDOM.nextInt(Run.APP_HEIGHT), 25);
    }
}

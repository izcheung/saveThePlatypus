package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.Group;
import javafx.scene.shape.Circle;

public class HorizontalEnemy extends Enemy {
    protected void setSpecificMovementDirection(Group root, Circle circle) {
        translateTransition.setByY(Run.APP_HEIGHT + 50);
    }
    @Override
    public Circle createCircle() {
        return new Circle(RANDOM.nextInt(Run.APP_WIDTH), -25, 25);
    }
}

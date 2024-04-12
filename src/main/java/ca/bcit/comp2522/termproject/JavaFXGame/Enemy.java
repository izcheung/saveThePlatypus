package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import java.util.Random;

public abstract class Enemy implements Collision {
    private final colorEnum[] colorChoices = colorEnum.values();
    protected TranslateTransition translateTransition = new TranslateTransition();
    protected static final Random RANDOM = new Random();

    public enum colorEnum {
        TEAL, ORANGE, LIME, RED
    }

    public void move(Group root, Circle circle) {
        translateTransition.setDuration(Duration.millis(Run.speed));
        translateTransition.setNode(circle);
        setSpecificMovementDirection(root, circle);
        translateTransition.setAutoReverse(false);
        translateTransition.setOnFinished(event -> root.getChildren().remove(circle));
        translateTransition.currentTimeProperty().addListener((observable, oldValue, newValue) ->
                checkCollision(Run.platypus, circle, root));
        root.getChildren().add(circle);
        translateTransition.play();
    }
    public void checkCollision(ImageView player, Circle enemy, Group root) {
        boolean collisionDetected = player.getBoundsInParent().intersects(enemy.getBoundsInParent());
        if (collisionDetected) {
            Run.gameOver = true;
            Platform.runLater(() -> GameOverText.display(root));
            System.out.println("Collision detected");
        }
    }
    private colorEnum generateRandomColor() {
        int randomColorIndex = RANDOM.nextInt(colorChoices.length);
        return colorChoices[randomColorIndex];
    }

    private Color convertColorEnumToJavaFX(colorEnum color) {
        return switch (color) {
            case TEAL -> Color.TEAL;
            case ORANGE -> Color.ORANGE;
            case LIME -> Color.LIME;
            case RED -> Color.RED;
        };
    }

    void generateEnemies(Group root) {
        Circle circle = createCircle();
        Color randomColor = convertColorEnumToJavaFX(generateRandomColor());
        circle.setFill(randomColor);
        move(root, circle);
    }
    abstract Circle createCircle();

    abstract void setSpecificMovementDirection(Group root, Circle circle);
}

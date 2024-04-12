package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.util.Random;

public class Enemy {

    private static final Random RANDOM = new Random();

    public enum EnemyColor {
        BLUE(Color.BLUE),
        RED(Color.RED),
        PURPLE(Color.PURPLE),
        YELLOW(Color.YELLOW);

        private final Color color;

        EnemyColor(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        private static final EnemyColor[] VALUES = values();
        private static final int SIZE = VALUES.length;

        public static EnemyColor getRandomColor() {
            return VALUES[RANDOM.nextInt(SIZE)];
        }
    }

    private static void moveEnemy(Group root, Circle circle) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.millis(2000));
        translateTransition.setNode(circle);
        if (circle.getCenterX() == -25) {
            translateTransition.setByX(Run.APP_WIDTH + 50);
        } else {
            translateTransition.setByY(Run.APP_HEIGHT + 50);
        }
        translateTransition.setAutoReverse(false);
        translateTransition.setOnFinished(event -> root.getChildren().remove(circle));
        translateTransition.currentTimeProperty().addListener((observable, oldValue, newValue) ->
                checkCollision(Run.platypus, circle, root));
        root.getChildren().add(circle);
        translateTransition.play();
    }

    public static void checkCollision(ImageView player, Circle enemy, Group root) {
        boolean collisionDetected = player.getBoundsInParent().intersects(enemy.getBoundsInParent());
        if (collisionDetected) {
            Run.gameOver = true;
            Platform.runLater(() -> GameOverText.display(root));
            System.out.println("Collision detected");
        }
    }

    public static void generateEnemies(Group root) {
        Random rand = new Random();
        Circle verticalCircle = new Circle(rand.nextInt(Run.APP_WIDTH), -25, 25,
                EnemyColor.getRandomColor().getColor());
        moveEnemy(root, verticalCircle);

        Circle horizontalCircle = new Circle(-25, rand.nextInt(Run.APP_HEIGHT), 25,
                EnemyColor.getRandomColor().getColor());
        moveEnemy(root, horizontalCircle);

        Run.cyclesCount++;
        Run.cyclesText.incrementCyclesCount();
    }
}

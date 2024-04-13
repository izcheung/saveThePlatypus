package ca.bcit.comp2522.termproject.JavaFXGame;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

import java.util.Objects;

/**
 * Represents a game loop responsible for generating enemies and updating the game state.
 *
 * @author Irene Cheung
 * @version 2024
 */
public record GameLoop(Group root) implements Runnable {
    /**
     * Constructs a GameLoop object with the specified root group.
     *
     * @param root The root group of the game scene.
     */
    public GameLoop {
    }

    /**
     * Gets the root group of the JavaFX scene.
     *
     * @return The root group of the JavaFX scene.
     */
    @Override
    public Group root() {
        return root;
    }

    /**
     * Runs the game loop to continuously generate enemies and update the game state.
     */
    @Override
    public void run() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(3), event -> {
                    if (!Run.gameOver) {
                        Enemy verticalEnemy = new VerticalEnemy();
                        Enemy horizontalEnemy = new HorizontalEnemy();
                        verticalEnemy.generateEnemies(root);
                        horizontalEnemy.generateEnemies(root);
                        Run.cyclesText.incrementCyclesCount();
                        Run.levelUpText.updateLevel();
                    }
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return {@code true} if this object is the same as the {@code o} argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameLoop gameLoop = (GameLoop) o;
        return Objects.equals(root(), gameLoop.root());
    }

    /**
     * Returns a string representation of the GameLoop object.
     *
     * @return A string representation of the GameLoop object, including its root group.
     */
    @Override
    public String toString() {
        return "GameLoop{" +
                "root=" + root +
                '}';
    }
}

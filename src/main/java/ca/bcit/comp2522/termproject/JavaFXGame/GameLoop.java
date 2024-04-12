package ca.bcit.comp2522.termproject.JavaFXGame;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

/**
 * Represents a game loop responsible for generating enemies and updating the game state.
 */
public class GameLoop implements Runnable {
    private final Group root;

    /**
     * Constructs a GameLoop object with the specified root group.
     *
     * @param root The root group of the game scene.
     */
    protected GameLoop(Group root) {
        this.root = root;
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
}

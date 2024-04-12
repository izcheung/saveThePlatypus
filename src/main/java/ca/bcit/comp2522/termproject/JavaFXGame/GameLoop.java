package ca.bcit.comp2522.termproject.JavaFXGame;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

public class GameLoop implements Runnable {
    private final Group root;
    protected GameLoop(Group root) {
        this.root = root;
    }
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

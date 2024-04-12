package ca.bcit.comp2522.termproject.JavaFXGame;


import javafx.application.Platform;
import javafx.scene.Group;

public class GameLoop implements Runnable {
    private final Group root;

    public GameLoop(Group root) {
        this.root = root;
    }

    @Override
    public void run() {
        while (!Run.gameOver) {
            try {
                Thread.sleep(2000); // Delay between cycles
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!Run.gameOver) {
                Platform.runLater(() -> {
                    Enemy.generateEnemies(root);
                });
            }
        }
    }
}

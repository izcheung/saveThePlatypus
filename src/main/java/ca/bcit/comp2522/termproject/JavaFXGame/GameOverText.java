package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class GameOverText {
    private static final int APP_WIDTH = Run.APP_WIDTH;
    private static final int APP_HEIGHT = Run.APP_HEIGHT;

    public static void display(Group root) {
        Platform.runLater(() -> {
            Text gameOverText = new Text("Game Over");
            gameOverText.setFill(Color.RED);
            gameOverText.setStyle("-fx-font: 48 arial;");
            gameOverText.setLayoutX((APP_WIDTH - gameOverText.getBoundsInLocal().getWidth()) / 3.5);
            gameOverText.setLayoutY((APP_HEIGHT - gameOverText.getBoundsInLocal().getHeight()) / 2);
            gameOverText.setVisible(true);

            // Add gameOverText to the root group
            if (!root.getChildren().contains(gameOverText)) {
                root.getChildren().add(gameOverText);
            }
        });
    }
}

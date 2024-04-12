package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class GameOverText {
    public static void display(Group root) {
        Platform.runLater(() -> {
            Text gameOverText = new Text("Game Over");
            gameOverText.setFill(Color.RED);
            gameOverText.setStyle("-fx-font: 48 arial;");
            gameOverText.setLayoutX((Run.APP_WIDTH - gameOverText.getBoundsInLocal().getWidth()) / 3.5);
            gameOverText.setLayoutY((Run.APP_HEIGHT - gameOverText.getBoundsInLocal().getHeight()) / 2);
            gameOverText.setVisible(true);

            if (!root.getChildren().contains(gameOverText)) {
                root.getChildren().add(gameOverText);
            }
        });
    }
}

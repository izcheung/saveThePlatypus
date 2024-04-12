package ca.bcit.comp2522.termproject.JavaFXGame;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Run extends Application {

    static final int APP_WIDTH = 500;
    static final int APP_HEIGHT = 600;
    public static ImageView platypus;

    protected static boolean gameOver = false;

    static int cyclesCount = 0;
    static CycleText cyclesText;

    @Override
    public void start(final Stage primaryStage) {
        Player platypus = Player.getInstance();
        Group root = new Group(platypus);
        Scene scene = new Scene(root, APP_WIDTH, APP_HEIGHT, Color.BLACK);

        Button startButton = new Button("Start Game");
        startButton.setOnAction(event -> startGameLoop(root)); // Pass the root group to startGameLoop
        startButton.setLayoutX(200);
        startButton.setLayoutY(250);
        root.getChildren().add(startButton);
        cyclesText = new CycleText(APP_WIDTH - 100, 50);
        Text gameOverText = new Text();
        cyclesText.setFill(Color.WHITE);
        root.getChildren().add(gameOverText);
        root.getChildren().add(cyclesText);

        scene.setOnKeyPressed(platypus::processKeyPress); // Corrected method reference

        primaryStage.setTitle("Flappy Platypus");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startGameLoop(Group root) {
        platypus = Player.getInstance();
        Platform.runLater(() -> {
            root.getChildren().clear(); // Clear the root node before starting the game loop
            root.getChildren().add(platypus); // Add the player circle back
            root.getChildren().add(cyclesText); // Add cyclesText
        });

        cyclesCount = 0;
        gameOver = false;

        new Thread(new GameLoop(root)).start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

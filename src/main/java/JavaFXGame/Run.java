package JavaFXGame;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Represents the main class to run the JavaFX game.
 *
 * @author Irene Cheung
 * @version 2024
 */
public class Run extends Application {

    public static final int APP_WIDTH = 500;
    public static final int APP_HEIGHT = 600;
    protected static ImageView platypus;
    protected static boolean gameOver = false;
    protected static int cyclesCount = 0;
    protected static CycleText cyclesText;
    protected static LevelUpText levelUpText;

    public static int speed = 2000;

    /**
     * Starts the JavaFX application.
     *
     * @param primaryStage The primary stage of the JavaFX application.
     */
    @Override
    public void start(final Stage primaryStage) {
        Player platypus = Player.getInstance();
        Group root = new Group(platypus);
        Scene scene = new Scene(root, APP_WIDTH, APP_HEIGHT, Color.BLACK);
        Button startButton = new Button("Start Game");
        startButton.setOnAction(event -> startGameLoop(root));
        startButton.setLayoutX(200);
        startButton.setLayoutY(250);
        cyclesText = new CycleText(APP_WIDTH - 100, 50);
        levelUpText = new LevelUpText(APP_WIDTH-100, 25 );
        Text gameOverText = new Text();
        root.getChildren().add(startButton);
        root.getChildren().add(gameOverText);
        root.getChildren().add(cyclesText);
        root.getChildren().add(levelUpText);
        scene.setOnKeyPressed(platypus::processKeyPress);
        primaryStage.setTitle("Save the Platypus!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Starts the game loop.
     *
     * @param root The root group of the game scene.
     */
    private void startGameLoop(Group root) {
        platypus = Player.getInstance();
        root.getChildren().clear();
        root.getChildren().add(platypus);
        root.getChildren().add(cyclesText);
        root.getChildren().add(levelUpText);
        new GameLoop(root).run();
    }

    /**
     * Drives the program.
     *
     * @param args The command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}


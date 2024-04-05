package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;


public class Run extends Application {

    public final int MOVE = 15;
    static final int APP_WIDTH = 500;
    static final int APP_HEIGHT = 600;

    public void start(final Stage primaryStage) {
        Player player = Player.getInstance();
        Group root = new Group(player.imageView);
        Scene scene = new Scene(root, APP_WIDTH, APP_HEIGHT, Color.BLACK);
        scene.setOnKeyPressed(this::processKeyPress);
        primaryStage.setTitle("Flappy Platypus");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /**
     * Modifies the position of the image view when an arrow key is pressed.
     *
     * @param event invoked this method
     */
    public void processKeyPress(final KeyEvent event) {
        Player player = Player.getInstance();

        switch (event.getCode()) {
            case UP:
                player.imageView.setY(player.imageView.getY() - MOVE);
                break;
            case DOWN:
                player.imageView.setY(player.imageView.getY() + MOVE);
                break;
            case RIGHT:
                player.imageView.setX(player.imageView.getX() + MOVE);
                break;
            case LEFT:
                player.imageView.setX(player.imageView.getX() - MOVE);
                break;
            default:
                break;
        }
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}


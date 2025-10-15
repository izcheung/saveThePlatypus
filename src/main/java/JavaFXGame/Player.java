package JavaFXGame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

/**
 * Represents the player character in the game.
 *
 * @author Irene Cheung
 * @version 2024
 */
public class Player extends ImageView implements PlayerBehavior {
    private static Player player;
    protected static int level;

    /**
     * Constructs a Player object with the specified image.
     *
     * @param image The image representing the player character.
     */
    public Player(Image image) {
        super(image);
        setFitWidth(80);
        setFitHeight(80);
        setPreserveRatio(true);
        setX(20);
        setY(450);
    }

    /**
     * Returns a singleton instance of the Player object.
     *
     * @return The Player object instance.
     */
    public static Player getInstance() {
        if (player == null) {
            Image platypusImage = new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp" +
                    ".com/f/0d96a16a-1811-4c6b-aa05-cafa3cfe446b/daidbk1-c256d6f4-ed34-4a00-ac65-f2fc52c83b34.png/v1/fill/w_400,h_362,q_80,strp/platypus_pixel_art_by_draculooloo_daidbk1-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MzYyIiwicGF0aCI6IlwvZlwvMGQ5NmExNmEtMTgxMS00YzZiLWFhMDUtY2FmYTNjZmU0NDZiXC9kYWlkYmsxLWMyNTZkNmY0LWVkMzQtNGEwMC1hYzY1LWYyZmM1MmM4M2IzNC5wbmciLCJ3aWR0aCI6Ijw9NDAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.IFcWos_tFJy-CWeAWEYg_YUD6CnAwv6wCg8cWCQVsK0", true);
            player = new Player(platypusImage);
        }
        return player;
    }

    /**
     * Processes the key press event to move the player character.
     *
     * @param event The key event representing the key press.
     */
    public void processKeyPress(final KeyEvent event) {
        int MOVE = 50;
        switch (event.getCode()) {
            case UP:
                setY(getY() - MOVE);
                if (getY() < 0) {
                    setY(0);
                }
                break;
            case DOWN:
                setY(getY() + MOVE);
                if (getY() > Run.APP_HEIGHT - player.getFitHeight()) {
                    setY(Run.APP_HEIGHT - player.getFitHeight());
                }
                break;
            case RIGHT:
                setX(getX() + MOVE);
                if (getX() > Run.APP_WIDTH - player.getFitWidth()) {
                    setX(Run.APP_WIDTH - player.getFitWidth());
                }
                break;
            case LEFT:
                setX(getX() - MOVE);
                if (getX() < 0) {
                    setX(0);
                }
                break;
            default:
                break;
        }
    }
}



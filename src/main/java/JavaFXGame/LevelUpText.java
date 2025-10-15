package JavaFXGame;

import javafx.scene.text.Text;
import javafx.scene.paint.Color;

/**
 * Represents a text node that displays the current level of the player.
 *
 * @author Irene Cheung
 * @version 2024
 */
public class LevelUpText extends Text {

    /**
     * Constructs a LevelUpText object with the specified position.
     *
     * @param x The x-coordinate of the text position.
     * @param y The y-coordinate of the text position.
     */
    public LevelUpText(int x, int y) {
        super(x, y, "Level: 0");
        setText("Level: " + Player.level);
        setFill(Color.WHITE);
    }

    /**
     * Updates the level text based on the number of cycles completed.
     */
    protected void updateLevel() {
        if (Run.cyclesCount % 5 == 0) {
            Player.level++;
            if (Run.speed >= 1000) {
                Run.speed -= 500;
            }
            setText("Level: " + Player.level);
        }
    }
}



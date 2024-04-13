package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.text.Text;
import javafx.scene.paint.Color;

/**
 * Represents a text node that displays the number of cycles.
 *
 * @author Irene Cheung
 * @version 2024
 */
public class CycleText extends Text {

    /**
     * Constructs a CycleText object with the specified position.
     *
     * @param x The x-coordinate of the text position.
     * @param y The y-coordinate of the text position.
     */
    public CycleText(int x, int y) {
        super(x, y, "Cycles: 0");
        setText("Cycles: " + Run.cyclesCount);
        setFill(Color.WHITE);
    }

    /**
     * Increments the cycles count and updates the text accordingly.
     */
    public void incrementCyclesCount() {
        Run.cyclesCount++;
        setText("Cycles: " + Run.cyclesCount);
    }


}

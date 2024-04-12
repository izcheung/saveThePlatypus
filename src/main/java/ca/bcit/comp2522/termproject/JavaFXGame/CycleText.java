package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class CycleText extends Text {
    public CycleText(int x, int y) {
        super(x, y, "Cycles: 0");
        setText("Cycles: " + Run.cyclesCount);
        setFill(Color.WHITE);
    }

    public void incrementCyclesCount() {
        Run.cyclesCount++;
        setText("Cycles: " + Run.cyclesCount);
    }
}

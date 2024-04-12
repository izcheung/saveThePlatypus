package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public class CycleText extends Text {
    private int cyclesCount;

    public CycleText(int x, int y) {
        super(x, y, "Cycles: 0");
        setCyclesCount(0);
        setFill(Color.WHITE);
    }

    public void setCyclesCount(int cyclesCount) {
        this.cyclesCount = cyclesCount;
        setText("Cycles: " + cyclesCount);
    }

    public void incrementCyclesCount() {
        cyclesCount++;
        setText("Cycles: " + cyclesCount);
    }
}

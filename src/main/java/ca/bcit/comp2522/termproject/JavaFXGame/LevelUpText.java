package ca.bcit.comp2522.termproject.JavaFXGame;

import javafx.scene.text.Text;
import javafx.scene.paint.Color;


public class LevelUpText extends Text {

    public LevelUpText(int x, int y) {
        super(x, y, "Level: 0");
        setLevelUpText(0);
        setFill(Color.WHITE);
    }
    public void setLevelUpText(int level) {
        setText("Level: " + Player.level);
    }
    public void updateLevel() {
        if (Run.cyclesCount % 5 == 0) {
            Player.level++;
            if (Run.speed >= 1000) {
                Run.speed -= 500;
            }
            setText("Level: " + Player.level);
        }
    }

}

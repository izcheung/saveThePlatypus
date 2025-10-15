package JavaFXGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelUpTextTest {
    @Test
    public void testLevelUpText() {
        LevelUpText levelUpText = new LevelUpText(1, 2);
        String expectedInitialText = "Level: 0";
        assertEquals(expectedInitialText, (levelUpText.getText()));
    }
}



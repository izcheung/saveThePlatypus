import ca.bcit.comp2522.termproject.JavaFXGame.CycleText;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CycleTextTest {
    @Test
    public void testCycleText() {
        CycleText cycleText = new CycleText(1, 2);
        String expectedInitialText = "Cycles: 0";
        assertEquals(expectedInitialText, (cycleText.getText()));

        String expectedFinalText = "Cycles: 1";
        cycleText.incrementCyclesCount();
        assertEquals(expectedFinalText, (cycleText.getText()));


    }


}

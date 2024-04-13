import ca.bcit.comp2522.termproject.JavaFXGame.HorizontalEnemy;
import javafx.scene.shape.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HorizontalEnemyTest {
    @Test
    public void testSetSpecificMovementDirection() {

        HorizontalEnemy horizontalEnemy = new HorizontalEnemy();

        Circle actualCircle = horizontalEnemy.createCircle();

        int placeholderNumber = 5;

        Circle expectedCircle =  new Circle(placeholderNumber, -25, 25);

        assertEquals(expectedCircle.getCenterY(), (actualCircle.getCenterY()));
        assertEquals(expectedCircle.getRadius(), (actualCircle.getRadius()));


    }


}

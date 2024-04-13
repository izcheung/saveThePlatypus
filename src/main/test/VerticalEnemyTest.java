import ca.bcit.comp2522.termproject.JavaFXGame.VerticalEnemy;
import javafx.scene.shape.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VerticalEnemyTest {
    @Test
    public void testSetSpecificMovementDirection() {

        VerticalEnemy verticalEnemy = new VerticalEnemy();

        Circle actualCircle = verticalEnemy.createCircle();

        int placeholderNumber = 5;

        Circle expectedCircle =  new Circle(-25, placeholderNumber, 25);

        assertEquals(expectedCircle.getCenterX(), (actualCircle.getCenterX()));
        assertEquals(expectedCircle.getRadius(), (actualCircle.getRadius()));


    }


}

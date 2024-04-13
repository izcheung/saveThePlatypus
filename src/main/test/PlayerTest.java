import ca.bcit.comp2522.termproject.JavaFXGame.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void testPlayer() {
        Player player = new Player(null);
        assertEquals(player.getFitWidth(), (80));
        assertEquals(player.getFitHeight(), (80));
        assertEquals(player.getX(), (20));
        assertEquals(player.getY(), 450);
    }


}

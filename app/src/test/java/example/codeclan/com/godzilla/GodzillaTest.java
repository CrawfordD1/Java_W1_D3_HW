package example.codeclan.com.godzilla;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GodzillaTest {

    Skyscraper skyscraper;
    Godzilla godzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Bill", 100, 50);
        skyscraper = new Skyscraper("building", 130);

    }

    @Test
    public void hasName(){
        assertEquals("Bill", godzilla.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("Roooooaooooaaaaaaaaar!!!", godzilla.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(50, godzilla.getDestructiveForce());
    }

    @Test
    public void canAttack(){
        godzilla.attack(skyscraper);
        assertEquals(80, skyscraper.getHealthValue());
    }
}

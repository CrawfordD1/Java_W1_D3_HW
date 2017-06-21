package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/06/2017.
 */

public class CthulhuTest {

    Skyscraper skyscraper;
    Cthulhu cthulhu;

    @Before
    public void before(){
        cthulhu = new Cthulhu("Gary", 100, 50);
        skyscraper = new Skyscraper("building", 130);

    }

    @Test
    public void hasName(){
        assertEquals("Gary", cthulhu.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("Bleeerrgghghgh!", cthulhu.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100, cthulhu.getHealthValue());
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(50, cthulhu.getDestructiveForce());
    }

    @Test
    public void canAttack(){
        cthulhu.attack(skyscraper);
        assertEquals(80, skyscraper.getHealthValue());
    }
}

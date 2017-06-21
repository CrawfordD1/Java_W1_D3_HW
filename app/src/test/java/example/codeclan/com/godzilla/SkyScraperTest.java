package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class SkyScraperTest {
    Skyscraper skyscraper;
    Godzilla godzilla;


    @Before
    public void before(){
        godzilla = new Godzilla("John", 100, 50);
        skyscraper = new Skyscraper("building", 130);
    }


    @Test
    public void hasType(){
        assertEquals("building", skyscraper.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(130, skyscraper.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Kabooooooooom", skyscraper.destroy());
    }

    @Test
    public void canBeAttacked(){
        godzilla.attack(skyscraper);
        assertEquals(80, skyscraper.getHealthValue());
    }
}

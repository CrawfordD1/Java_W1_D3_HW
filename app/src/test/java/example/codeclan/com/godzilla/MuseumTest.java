package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/06/2017.
 */

public class MuseumTest {

    Museum museum;
    Cthulhu cthulhu;


    @Before
    public void before(){
        cthulhu = new Cthulhu("John", 100, 50);
        museum = new Museum("building", 130);
    }


    @Test
    public void hasType(){
        assertEquals("building", museum.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(130, museum.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Oh No, The Art!", museum.destroy());
    }

    @Test
    public void canBeAttacked(){
        cthulhu.attack(museum);
        assertEquals(80, museum.getHealthValue());
    }
}

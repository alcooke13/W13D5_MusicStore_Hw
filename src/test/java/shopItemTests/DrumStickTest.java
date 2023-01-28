package shopItemTests;
import org.junit.Before;
import org.junit.Test;
import shopItems.DrumStick;
import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void guitarStickTest(){
        drumStick = new DrumStick("Sticks", 20.00, 30.00);
    }

    @Test
    public void canGetDrumStickName(){
        assertEquals("Sticks", drumStick.getProductName());
    }

    @Test
    public void canGetDrumStickCost(){
        assertEquals(20.00, drumStick.getCost(), 0.01);
    }

    @Test
    public void canGetDrumStickPrice(){
        assertEquals(30.00, drumStick.getPrice(), 0.01);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(10.00, drumStick.markUp(), 0.01);
    }

}

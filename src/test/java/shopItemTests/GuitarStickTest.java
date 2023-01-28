package shopItemTests;
import org.junit.Before;
import org.junit.Test;
import shopItems.GuitarStick;
import static org.junit.Assert.assertEquals;

public class GuitarStickTest {

    GuitarStick guitarStick;

    @Before
    public void guitarStickTest(){
        guitarStick = new GuitarStick("Sticks", 20.00, 30.00);
    }

    @Test
    public void canGetGuitarStickName(){
        assertEquals("Sticks", guitarStick.getProductName());
    }

    @Test
    public void canGetGuitarStickCost(){
        assertEquals(20.00, guitarStick.getCost(), 0.01);
    }

    @Test
    public void canGetGuitarStickPrice(){
        assertEquals(30.00, guitarStick.getPrice(), 0.01);
    }

}

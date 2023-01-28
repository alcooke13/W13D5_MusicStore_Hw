package instrumentTests;
import instruments.InstrumentType;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class keyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard(InstrumentType.KEYBOARD, "Roland", "Black", 88, 900, 1200);

    }
    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("Keyboard", keyboard.getInstrumentType().getName());
    }

    @Test
    public void canGetKeyboardMake(){
        assertEquals("Roland", keyboard.getMake());
    }

    @Test
    public void canGetKeyboardColor(){
        assertEquals("Black", keyboard.getColor());
    }

    @Test
    public void canGetNumOfKeys(){
        assertEquals(88, keyboard.getNumOfKeys());
    }

    @Test
    public void keyboardCanPlay(){
        assertEquals("Keyboard sounds", keyboard.play());
    }

    @Test
    public void keyboardHasCost(){
        assertEquals(900, keyboard.getCost(), 0.01);
    }

    @Test
    public void keyboardHasPrice(){
        assertEquals(1200, keyboard.getPrice(), 0.01);
    }


}

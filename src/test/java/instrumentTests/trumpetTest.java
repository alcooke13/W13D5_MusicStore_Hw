package instrumentTests;

import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class trumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(InstrumentType.TRUMPET, "Yamaha", "Black", 8, 450, 600);

    }
    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("Trumpet", trumpet.getInstrumentType().getName());
    }

    @Test
    public void canGetTrumpetMake(){
        assertEquals("Yamaha", trumpet.getMake());
    }

    @Test
    public void canGetTrumpetColor(){
        assertEquals("Black", trumpet.getColor());
    }

    @Test
    public void canGetNumOfValves(){
        assertEquals(8, trumpet.getNumOfValves());
    }

    @Test
    public void trumpetCanPlay(){
        assertEquals("Trumpet sounds", trumpet.play());
    }


    @Test
    public void trumpetHasCost(){
        assertEquals(450, trumpet.getCost(), 0.01);
    }

    @Test
    public void trumpetHasPrice(){
        assertEquals(600, trumpet.getPrice(), 0.01);
    }

}

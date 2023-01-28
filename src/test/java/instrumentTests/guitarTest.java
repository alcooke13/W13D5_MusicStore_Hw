package instrumentTests;
import instruments.InstrumentType;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class guitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.GUITAR, "Gibson", "Brown", 6, 500, 600);

    }
    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("Guitar", guitar.getInstrumentType().getName());
    }

    @Test
    public void canGetGuitarMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void canGetGuitarColor(){
        assertEquals("Brown", guitar.getColor());
    }

    @Test
    public void canGetNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("Guitar sounds", guitar.play());
    }

    @Test
    public void guitarHasCost(){
        assertEquals(500, guitar.getCost(), 0.01);
    }

    @Test
    public void guitarHasPrice(){
        assertEquals(600, guitar.getPrice(), 0.01);
    }

    @Test
    public void canGetGuitarMarkup(){
        assertEquals(100, guitar.markUp(), 0.01);
    }
}

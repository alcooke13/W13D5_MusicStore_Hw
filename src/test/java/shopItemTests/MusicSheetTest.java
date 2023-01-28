package shopItemTests;
import org.junit.Before;
import org.junit.Test;
import shopItems.MusicSheet;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void musicSheetTest(){
        musicSheet = new MusicSheet("Sheets", 25.00, 35.00);
    }

    @Test
    public void canGetMusicSheetName(){
        assertEquals("Sheets", musicSheet.getProductName());
    }

    @Test
    public void canGetMusicSheetCost(){
        assertEquals(25.00, musicSheet.getCost(), 0.01);
    }

    @Test
    public void canGetMusicSheetPrice(){
        assertEquals(35.00, musicSheet.getPrice(), 0.01);
    }

}

import behaviors.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shopItems.DrumStick;
import shopItems.MusicSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MusicShopTest {

    private MusicShop musicShop;
    private  Guitar guitar;
    private Trumpet trumpet;
    private MusicSheet musicSheet;
    private DrumStick drumStick;

    private  Customer customer;

    @Before
    public void before(){
        musicShop = new MusicShop("Music Land", 5000.00);
        guitar = new Guitar(InstrumentType.GUITAR, "Gibson", "Brown", 6, 500, 600);
        trumpet = new Trumpet(InstrumentType.TRUMPET, "Yamaha", "Black", 8, 390, 450);
        drumStick = new DrumStick("Sticks", 20.00, 30.00);
        musicSheet = new MusicSheet("Sheets", 25.00, 35.00);
        customer = new Customer("Jeff", 490.00);

        //Adding instrument and items to inventory;
        musicShop.addToStock(guitar);
        musicShop.addToStock(trumpet);
        musicShop.addToStock(drumStick);
        musicShop.addToStock(musicSheet);

        //
        List<ISell> stock = Arrays.asList(guitar, trumpet, drumStick, musicSheet);

    }

    @Test
    public void musicShopHasName(){
        assertEquals("Music Land", musicShop.getName());
    }

    @Test
    public void musicShopHasMoney(){
        assertEquals(5000.00, musicShop.getTill(), 0.01);
    }

    @Test
    public void hasStockCountOfFourItems(){
        assertEquals(4, musicShop.getStockCount());
    }

    @Test
    public void stockCanReduceToThreeNoGuitar(){
        musicShop.removeFromStock(guitar);
        assertFalse(musicShop.getStock().contains(guitar));
        assertEquals(3, musicShop.getStockCount());
    }

    @Test
    public void canGetTotalProfitPotentialFromStock(){
        assertEquals(180, musicShop.countPotentialProfit());
    }

    @Test
    public void checkTillIncreasesSellingGuitar(){
        musicShop.sell(customer, guitar);
        assertEquals(5000.00, musicShop.getTill(), 0.01);

    }

    @Test
    public void checkStockDecreasesSellingMusicSheet(){
        musicShop.sell(customer, musicSheet);
        assertFalse(musicShop.getStock().contains(musicSheet));
        assertEquals(3, musicShop.getStockCount());
    }

    @Test
    public void canGetWhichItemsCustomerCanAfford(){
        ArrayList<ISell> items = new ArrayList<ISell>();
        items.add(trumpet);
        items.add(drumStick);
        items.add(musicSheet);
        assertEquals(items, customer.allAffordable(musicShop.getStock()));

    }

    @Test
    public void findCheapestItem(){
        assertEquals(drumStick, musicShop.findCheapest());
    }


}

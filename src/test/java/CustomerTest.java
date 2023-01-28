import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer;
    private Customer customer2;
    private Guitar guitar;

    @Before
    public void before(){
        customer = new Customer("Joey", 1000.00);
        customer2 = new Customer("Jeff", 400.00);
        guitar = guitar = new Guitar(InstrumentType.GUITAR, "Gibson", "Brown", 6, 500, 600);
    }

    @Test
    public void customerHasName(){
        assertEquals("Joey", customer.getName());
    }

    @Test
    public void customerHasMoney(){
        assertEquals(1000, customer.getMoney(), 0.01);
    }

    @Test
    public void customerStartsWithNoInstruments(){
        assertEquals(0, customer.getInstrumentCount());
    }

    @Test
    public void customerCanReduceMoney(){
        customer.reduceMoney(100.00);
        assertEquals(900.00, customer.getMoney(), 0.01);
    }

    @Test
    public void customerCanBuyItem(){
        assertTrue(customer.canBuy(guitar));
    }

    @Test
    public void customerCannotBuyNotEnoughMoney(){
        assertFalse(customer2.canBuy(guitar));
    }

    @Test
    public void checkCustomerCollectionBuysGuitar(){
        customer.buy(guitar);
        assertEquals(1, customer.getInstrumentCount());
    }

    @Test
    public void checkCustomerMoneyDecreasesBuyingGuitar(){
        customer.buy(guitar);
        assertEquals(400, customer.getMoney(), 0.01);
    }
}

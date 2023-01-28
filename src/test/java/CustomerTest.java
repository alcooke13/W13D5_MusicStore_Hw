import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void before(){
        customer = new Customer("Joey", 1000.00);
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

}

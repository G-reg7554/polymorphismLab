import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    private DebitCard debitCard;
    @Before
    public void setUp(){
         debitCard = new DebitCard(100, 12345678, "03/23",123);
    }
    @Test
    public void hasStartingBalance(){


        assertEquals(100, debitCard.getBalance(), 0.0);
    }

    @Test
    public  void canChargeDebitCard(){

        debitCard.charge(10);
        assertEquals(90,debitCard.getBalance(),0.0);
    }
    @Test
    public void getSecurityNumberTest(){
        assertEquals(123, debitCard.getSecurityNumber());
    }

    @Test
    public void getCardNumberTest(){
        assertEquals(12345678, debitCard.getCardNumber());
    }

    @Test
    public void getExpiryDate(){
        assertEquals("03/23", debitCard.getExpiryDate());
    }
}

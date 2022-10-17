import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    @Before
    public void setUp(){
        creditCard = new CreditCard(1000,12345678,"05/30", 987);
    }
    @Test
    public void getSecurityNumberTest(){
        assertEquals(987, creditCard.getSecurityNumber());
    }

    @Test
    public void getCardNumberTest(){
        assertEquals(12345678, creditCard.getCardNumber());
    }

    @Test
    public void getExpiryDate(){
        assertEquals("05/30", creditCard.getExpiryDate());
    }

    @Test
    public void getStartingBalanceTest(){
        assertEquals(1000, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public  void chargeCreditCardTest(){
        creditCard.charge(100);
        assertEquals(897, creditCard.getAvailableCredit(), 0.0);
    }
}

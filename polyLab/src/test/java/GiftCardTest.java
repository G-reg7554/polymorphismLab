import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    GiftCard giftCard;
    @Before
    public  void setUp(){
        giftCard = new GiftCard(100);
    }

    @Test
    public void StartsWith100Test(){
        assertEquals(100, giftCard.getBalance(), 0.0);
    }

    @Test
    public  void chargingGiftCardTest(){
        giftCard.charge(15.00);

        assertEquals(85.00, giftCard.getBalance(), 0.0);
    }
}

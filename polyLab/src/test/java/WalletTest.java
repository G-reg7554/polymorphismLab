import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    Wallet wallet;
    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void setUp(){
        wallet = new Wallet();
        creditCard = new CreditCard(1000,12345678,"05/30", 987);
        debitCard = new DebitCard(100, 12345678, "03/23",123);
        giftCard = new GiftCard(100);
        wallet.addNewCard(creditCard);
        wallet.addNewCard(debitCard);
        wallet.addNewCard(giftCard);
    }

    @Test
    public void checkWalletCardsTest(){

        assertEquals(3, wallet.getCards().size());
    }

    @Test
    public  void CanPayWithAnyCard(){
        wallet.pay(debitCard, 10);
        assertEquals(90, debitCard.getBalance(), 0.0);
    }

    @Test
    public  void CanPayWithAnyCard1(){
        wallet.pay(creditCard, 100);
        assertEquals(897, creditCard.getAvailableCredit(), 0.0);
    }

    
}

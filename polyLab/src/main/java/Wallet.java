import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargable> cards;
    public Wallet(){
        this.cards = new ArrayList<>();
    }

    public void addNewCard(IChargable card){
        cards.add(card);
    }

    public ArrayList<IChargable> getCards() {
        return cards;
    }

    public void pay(IChargable card, double purchaseAmount){
        card.charge(purchaseAmount);
    }
}

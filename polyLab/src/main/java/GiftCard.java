public class GiftCard implements IChargable{

    private double balance;

    public  GiftCard(double balance){
        this.balance = balance;
    }

    public void charge(double purchaseAmount){
        balance -= purchaseAmount;
    }

    public double getBalance() {
        return balance;
    }
}

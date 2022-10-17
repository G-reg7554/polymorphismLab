public class DebitCard extends PaymentCard implements IChargable {

    private double balance;

    public DebitCard(double balance, int cardNumber, String expiryDate, int securityNumber){
        super(cardNumber, expiryDate, securityNumber);
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void charge(double purchaseAmount){
        balance -= purchaseAmount;
        System.out.println("You Have Been Charge " + purchaseAmount);
    }
}

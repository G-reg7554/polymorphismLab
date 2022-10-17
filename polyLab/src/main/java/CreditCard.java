public class CreditCard extends PaymentCard implements IChargable {

    private double availableCredit;

    public CreditCard (double availableCredit, int cardNumber, String expiryDate, int securityNumber){
        super( cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;

    }
    @Override
    public void charge(double purchaseAmount) {
        double amountToCharge = purchaseAmount * 1.03;
        availableCredit -= amountToCharge;
        System.out.println("You Have Been Charged " + amountToCharge);


    }

    public double getAvailableCredit() {
        return availableCredit;
    }
}

package payment;

public class CardPayment implements PaymentStrategy {
    public void pay(){
        System.out.println("Paid using Card");
    }
}

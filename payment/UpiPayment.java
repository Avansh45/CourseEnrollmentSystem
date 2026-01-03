package payment;

public class UpiPayment implements PaymentStrategy {
    public void pay(){
        System.out.println("Paid using UPI");
    }
}

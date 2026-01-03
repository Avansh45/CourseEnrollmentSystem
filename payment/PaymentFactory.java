package payment;

public class PaymentFactory {

    public static PaymentStrategy getPaymentMethod(String type){
        if(type.equalsIgnoreCase("upi"))
            return new UpiPayment();
        else
            return new CardPayment();
    }
}

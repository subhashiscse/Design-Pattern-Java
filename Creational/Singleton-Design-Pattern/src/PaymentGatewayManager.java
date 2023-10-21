public class PaymentGatewayManager {
    private PaymentGatewayManager() {
        System.out.println("Payment Gateway Manager initialized.");
    }

    private static PaymentGatewayManager instance;

    public static PaymentGatewayManager getInstance() {
        if (instance == null) {
            instance = new PaymentGatewayManager();
        }
        return instance;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through the payment gateway.");
    }
}

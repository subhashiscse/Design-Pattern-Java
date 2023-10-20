public class Main {
    public static void main(String[] args) {
        PaymentGatewayManager paymentGateway = PaymentGatewayManager.getInstance();

        paymentGateway.processPayment(100.0);

        // Attempt to create another instance (should return the existing instance)
        PaymentGatewayManager anotherPaymentGateway = PaymentGatewayManager.getInstance();

        // Check if both instances are the same.
        if (paymentGateway == anotherPaymentGateway) {
            System.out.println("Both instances are the same. Singleton pattern is working.");
        } else {
            System.out.println("Singleton pattern is not working correctly.");
        }
    }
}
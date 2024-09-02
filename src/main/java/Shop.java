public class Shop {
    private final PaymentProcessor paymentProcessor;

    public Shop(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(Order order) {
        double amount = order.totalPrice();
        paymentProcessor.processPayment(amount);
    }
}
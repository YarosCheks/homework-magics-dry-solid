public class Main {
    public static void main(String[] args) {
        Product apple = new Product(1, "Apple", 0.5);
        Product banana = new Product(2, "Banana", 0.3);

        Order order = new Order();
        order.addProduct(apple, 4);
        order.addProduct(banana, 10);

        PaymentProcessor paymentProcessor = new CreditCardProcessor();
        Shop shop = new Shop(paymentProcessor);

        shop.checkout(order);
    }
}


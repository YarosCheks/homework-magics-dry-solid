public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа по кредитной карте на сумму $" + amount);
    }
}
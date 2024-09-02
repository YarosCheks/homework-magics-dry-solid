// Принцип инверсии зависимостей (DIP): Класс Shop зависит от абстракций
// (интерфейсов), а не от конкретных реализаций
public interface PaymentProcessor {
    void processPayment(double amount);
}
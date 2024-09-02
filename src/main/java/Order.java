import java.util.ArrayList;
import java.util.List;

// Принцип открытости/закрытости (OCP): Класс Order открыт для расширения
// (можно добавлять новые методы), но закрыт для модификации
public class Order {
    private final List<OrderItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public double totalPrice() {
        return items.stream().mapToDouble(OrderItem::totalPrice).sum();
    }
}



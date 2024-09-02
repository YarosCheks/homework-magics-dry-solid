// Принцип подстановки Барбары Лисков (LSP): OrderItem может быть заменен
// на любой его подтип без изменения корректности программы
public class OrderItem {
    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return product.getPrice() * quantity;
    }
}

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, int basketSize) {
        this.customer = customer;
        this.basket = new Product[basketSize];
    }

    public String toString() {
        return Arrays.toString(basket);
    }

    public void addToBasket(Product product) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                return;
            }
        }
        throw new RuntimeException("Корзина переполнена!");
    }

    private boolean isBasketEquals(Product[] basket) {
        if (this.basket.length != basket.length) {
            return false;
        }
        for (int i = 0; i < this.basket.length; i++) {
            if (this.basket[i] == null && basket[i] == null) {
                continue;
            }
            if (this.basket[i] == null || !this.basket[i].equals(basket[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) && isBasketEquals(order.basket);
    }
}

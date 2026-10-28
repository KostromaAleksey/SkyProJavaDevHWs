package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {

    private final Map<String, List<Product>> basket = new HashMap<>();

    public void addProduct(Product product) {
        basket.computeIfAbsent(product.getName(), _ -> new LinkedList<>()).add(product);
    }

    public double getPrice() {
        return basket.values().stream().flatMap(Collection::stream).mapToDouble(Product::getPrice).sum();
    }

    private long getSpecialCount(List<Product> products) {
        return products.stream().filter(Product::isSpecial).count();
    }

    public void print() {
        System.out.println("Корзина:");
        List<Product> products = basket.values().stream().flatMap(Collection::stream)
                .filter(Objects::nonNull).toList();
        products.forEach(System.out::println);
        System.out.println("_______________");
        if (products.isEmpty()) {
            System.out.println("В корзине пусто");

        } else {
            System.out.println("Итого: " + getPrice());
        }
        System.out.println("Специальных товаров: " + getSpecialCount(products));
        System.out.println();
    }

    public boolean isProductExist(String name) {
        return basket.containsKey(name);
    }

    public void clear() {
        basket.clear();
    }

    public List<Product> deleteProductByName(String name) {
        return basket.remove(name);
    }
}

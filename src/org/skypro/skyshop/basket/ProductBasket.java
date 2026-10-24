package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductBasket {

    private final Map<String, List<Product>> basket = new HashMap<>();

    public void addProduct(Product product) {
        basket.computeIfAbsent(product.getName(), v -> new LinkedList<>()).add(product);
    }

    public double getPrice() {
        double price = 0;
        for (List<Product> products : basket.values()) {
            for (Product product : products) {
                if (product != null) {
                    price += product.getPrice();
                }
            }
        }
        return price;
    }

    public void print() {
        System.out.println("Корзина:");
        boolean isPrint = false;
        int specialProductCount = 0;
        for (List<Product> products : basket.values()) {
            for (Product product : products) {
                if (product == null) {
                    continue;
                }
                System.out.println(product);
                isPrint = true;
                if (product.isSpecial()) {
                    specialProductCount++;
                }
            }
        }
        System.out.println("_______________");
        if (isPrint) {
            System.out.println("Итого: " + getPrice());
        } else {
            System.out.println("В корзине пусто");
        }
        System.out.println("Специальных товаров: " + specialProductCount);
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

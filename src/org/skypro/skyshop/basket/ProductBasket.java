package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {

    private final Product[] basket = new Product[5];

    public void addProduct(Product product) {
        boolean isAdd = false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                isAdd = true;
                break;
            }
        }
        if (!isAdd) {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getCost() {
        int cost = 0;
        for (Product product : basket) {
            if (product != null) {
                cost += product.getCost();
            }
        }
        return cost;
    }

    public void print() {
        boolean isPrint = false;
        for (Product product : basket) {
            if (product != null) {
                System.out.println(product);
                isPrint = true;
            }
        }
        if (isPrint) {
            System.out.println("Итого: " + getCost());
        } else {
            System.out.println("В корзине пусто");
        }
    }

    public boolean isProductExist(String name) {
        boolean isExist = false;
        for (Product product : basket) {
            if (product != null && product.getName().equals(name)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public void clear() {
        Arrays.fill(basket, null);
    }
}

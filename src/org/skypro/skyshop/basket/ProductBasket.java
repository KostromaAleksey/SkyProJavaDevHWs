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

    public double getPrice() {
        double price = 0;
        for (Product product : basket) {
            if (product != null) {
                price += product.getPrice();
            }
        }
        return price;
    }

    public void print() {
        boolean isPrint = false;
        int specialProductCount = 0;
        for (Product product : basket) {
            if (product != null) {
                System.out.println(product);
                isPrint = true;
                if (product.isSpecial()) {
                    specialProductCount++;
                }
            }
        }
        if (isPrint) {
            System.out.println("Итого: " + getPrice());
        } else {
            System.out.println("В корзине пусто");
        }
        System.out.println("Специальных товаров: " + specialProductCount);
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

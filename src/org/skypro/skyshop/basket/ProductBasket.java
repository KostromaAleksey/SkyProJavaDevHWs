package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {

    private final LinkedList<Product> basket = new LinkedList<>();

    public void addProduct(Product product) {
        basket.add(product);
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
        System.out.println("Корзина:");
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
        System.out.println();
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
        basket.clear();
    }

    public List<Product> deleteProductByName(String name) {
        List<Product> removedList = new ArrayList<>();

        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                removedList.add(product);
                iterator.remove();
            }
        }

        return removedList;
    }
}

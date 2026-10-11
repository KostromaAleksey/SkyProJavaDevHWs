package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("apple", 5);
        Product product2 = new Product("brad", 2);
        Product product3 = new Product("egg", 10);
        Product product4 = new Product("oil", 111);
        Product product5 = new Product("paper", 56);
        Product product6 = new Product("cup", 250);

        ProductBasket productBasket = new ProductBasket();

        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        productBasket.addProduct(product5);
        productBasket.addProduct(product6);

        productBasket.print();

        System.out.println("Стоимость корзины: " + productBasket.getCost());

        System.out.println("В корзине есть apple: " + productBasket.isProductExist("apple"));

        System.out.println("В корзине есть orange: " + productBasket.isProductExist("orange"));

        productBasket.clear();

        productBasket.print();

        System.out.println("Стоимость корзины: " + productBasket.getCost());

        System.out.println("В корзине есть apple: " + productBasket.isProductExist("apple"));
    }
}
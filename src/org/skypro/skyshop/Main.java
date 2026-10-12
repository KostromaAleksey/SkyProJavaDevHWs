package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class Main {
    public static void main(String[] args) {
        Product product1 = new SimpleProduct("apple", 5);
        Product product2 = new FixPriceProduct("brad");
        Product product3 = new DiscountedProduct("egg", 10, 5);
        Product product4 = new DiscountedProduct("oil", 111, 40);
        Product product5 = new FixPriceProduct("paper");
        Product product6 = new SimpleProduct("cup", 250);

        ProductBasket productBasket = new ProductBasket();

        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        productBasket.addProduct(product5);
        productBasket.addProduct(product6);

        productBasket.print();

        System.out.println("Стоимость корзины: " + productBasket.getPrice());

        System.out.println("В корзине есть apple: " + productBasket.isProductExist("apple"));

        System.out.println("В корзине есть orange: " + productBasket.isProductExist("orange"));

        productBasket.clear();

        productBasket.print();

        System.out.println("Стоимость корзины: " + productBasket.getPrice());

        System.out.println("В корзине есть apple: " + productBasket.isProductExist("apple"));
    }
}
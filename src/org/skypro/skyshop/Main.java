package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new SimpleProduct("apple", 5);
        Product product2 = new FixPriceProduct("brad");
        Product product3 = new DiscountedProduct("egg", 10, 5);
        Product product4 = new DiscountedProduct("oil", 111, 40);
        Product product5 = new FixPriceProduct("paper");
        Product product6 = new SimpleProduct("cup", 250);
        Product product7 = new DiscountedProduct("egg", 10, 5);

        ProductBasket productBasket = new ProductBasket();
        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        productBasket.addProduct(product5);
        productBasket.addProduct(product6);
        productBasket.addProduct(product7);

        productBasket.print();

        List<Product> removedList = productBasket.deleteProductByName("egg");
        System.out.println("Удаленные продукты: " + removedList);
        System.out.println();

        productBasket.print();

        removedList = productBasket.deleteProductByName("egg");
        if (removedList.isEmpty()) {
            System.out.println("Удаленные продукты: Список пуст " + removedList);
        } else {
            System.out.println("Удаленные продукты: " + removedList);
        }
        System.out.println();

        productBasket.print();

        SearchEngine searchEngine = new SearchEngine();

        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(product4);
        searchEngine.add(product5);
        searchEngine.add(product6);
        searchEngine.add(product7);

        Article article1 = new Article("article1", "article1Text");
        Article article2 = new Article("article2", "article2Text");
        Article article3 = new Article("article3", "article3Text");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        System.out.println(searchEngine.search("a"));
    }
}
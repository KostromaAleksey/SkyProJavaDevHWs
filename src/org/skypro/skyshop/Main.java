package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new SimpleProduct("apple", 5);
        Product product2 = new FixPriceProduct("brad");
        Product product3 = new DiscountedProduct("egg", 10, 5);
        Product product4 = new DiscountedProduct("oil", 111, 40);
        Product product5 = new FixPriceProduct("paper");
        Product product6 = new SimpleProduct("cup", 250);

        SearchEngine searchEngine = new SearchEngine(10);

        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(product4);
        searchEngine.add(product5);
        searchEngine.add(product6);

        Article article1 = new Article("article1", "article1Text");
        Article article2 = new Article("article2", "article2Text");
        Article article3 = new Article("article3", "article3Text");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        System.out.println(Arrays.toString(searchEngine.search("article")));
        System.out.println(Arrays.toString(searchEngine.search("brad")));
        System.out.println(Arrays.toString(searchEngine.search("a")));
        System.out.println(Arrays.toString(searchEngine.search("ttt")));

        for (Searchable searchable : searchEngine.search("a")) {
            System.out.println(searchable.getStringRepresentation());
        }
    }
}
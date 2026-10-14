package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final double PRICE = 55;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    public String toString() {
        return getName() + ": Фиксированная цена " + PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}

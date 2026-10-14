package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private final double price;
    private final int discount;

    public DiscountedProduct(String name, double price, int discount) {
        super(name);
        this.price = price;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return price * ((100 - discount) / 100d);
    }

    @Override
    public String toString() {
        return getName() + ": " + price + " (" + discount + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}

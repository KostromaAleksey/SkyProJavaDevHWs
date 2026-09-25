public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "P1", 1, "A");
        Product product2 = new Product(1, "P2", 2, "A");
        Product product3 = new Product(3, "P3", 3, "C");
        Product product4 = new Product(4, "P4", 4, "D");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        System.out.println(product1.equals(product2));
        System.out.println(product3.equals(product4));

        Order order1 = new Order("Customer1", 4);
        order1.addToBasket(product1);
        order1.addToBasket(product2);
        order1.addToBasket(product3);
        order1.addToBasket(product4);

        Order order2 = new Order("Customer1", 4);
        order2.addToBasket(product1);
        order2.addToBasket(product2);
        order2.addToBasket(product3);
        order2.addToBasket(product4);

        Order order3 = new Order("Customer3", 4);
        order3.addToBasket(product1);
        order3.addToBasket(product2);
        order3.addToBasket(product3);
        order3.addToBasket(product4);

        Order order4 = new Order("Customer4", 4);
        order4.addToBasket(product1);
        order4.addToBasket(product2);
        order4.addToBasket(product3);
        order4.addToBasket(product4);

        Order order5 = new Order("Customer5", 4);
        order5.addToBasket(product1);
        order5.addToBasket(product2);
        order5.addToBasket(product3);
        order5.addToBasket(product4);

        Order order6 = new Order("Customer5", 4);
        order6.addToBasket(product4);
        order6.addToBasket(product3);
        order6.addToBasket(product2);
        order6.addToBasket(product1);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);
        System.out.println(order6);

        System.out.println(order1.equals(order2));
        System.out.println(order3.equals(order4));
        System.out.println(order5.equals(order6));
    }
}
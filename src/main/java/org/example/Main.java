package org.example;

import org.example.Product;

public class Main {
    public static void main(String[] args) {
        Cart cart1 = new Cart();
        Product Macbook = new Product("Macbook",1000);
        Product Iphone = new Product("Iphone 16", 900);

        cart1.addProduct(Macbook);
        cart1.addProduct(Iphone);

        cart1.print();
    }
}
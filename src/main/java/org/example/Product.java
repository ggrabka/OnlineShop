package org.example;

public class Product {

    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public void print(Product product) {
        System.out.print("Product: " +product.getName());
        System.out.print("Price: " +product.getPrice());
    }
}

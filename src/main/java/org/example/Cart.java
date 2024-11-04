package org.example;
import org.example.Product;
import java.util.ArrayList;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();

    public Cart() {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void print() {

        for(Product product : products) {
            System.out.print("Product: " +product.getName() +" ");
            System.out.print("Price: " +product.getPrice());
            System.out.println();
        }

    }

    public void getTotal(Product[] products) {
        int total = products.length;
        System.out.println("Total products: " +total);
    }
}

package com.org.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> cart = new ArrayList<>();

    public List<Product> getCart() {
        return cart;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void purchase(String productToPurchase) {
        for (Product product : cart){
            if (product.getName().equalsIgnoreCase(productToPurchase)) {
                cart.remove(product);
                System.out.println("Product Purchased Successfully..!");
            }
        }
    }
}

package com.org.shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;
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
        Iterator<Product> iterator = cart.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(productToPurchase)) {
                iterator.remove();
                System.out.println("Product Purchased Successfully..!");
                break;
            }
        }
    }
}

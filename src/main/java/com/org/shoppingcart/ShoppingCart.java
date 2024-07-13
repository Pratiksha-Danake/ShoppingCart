package com.org.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    public List<Product> getCart() {
        return cart;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }
}

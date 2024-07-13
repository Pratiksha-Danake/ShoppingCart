package com.org.shoppingcart;

import com.org.shoppingcart.exception.InvalidProductDataException;
import com.org.shoppingcart.exception.InvalidProductNameException;
import com.org.shoppingcart.exception.InvalidProductPriceException;

public class Product {
    private String name;
    private double price;

    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Product create(String name, double price) throws InvalidProductDataException {
        if (name == null || name.equals(" "))
            throw new InvalidProductNameException("Product name can't be null or empty:"+ name);
        else if (price < 0)
            throw new InvalidProductPriceException("Product price can't be less than zero:"+price);
        return null;
    }
}

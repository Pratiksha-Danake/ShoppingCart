package com.org.shoppingcart;

import com.org.shoppingcart.exception.InvalidProductDataException;
import com.org.shoppingcart.exception.InvalidProductNameException;
import com.org.shoppingcart.exception.InvalidProductPriceException;

import java.util.Objects;

public class Product {
    private final String name;
    private final double price;

    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Product create(String name, double price) throws InvalidProductDataException {
        if (name == null || name.equals(" "))
            throw new InvalidProductNameException("Product name can't be null or empty:" + name);
        else if (price < 0)
            throw new InvalidProductPriceException("Product price can't be less than zero:" + price);
        return new Product(name, price);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

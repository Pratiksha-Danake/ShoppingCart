package com.org.shoppingcart;

import com.org.shoppingcart.exception.InvalidProductDataException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void shouldCreateProductWithNameAndPrice() throws InvalidProductDataException {
        // arrange
        String productName = "Bag";
        double price = 50.50;
        Product expected = Product.create(productName, price);

        // act
        Product actual = Product.create(productName, price);

        // assert
        assertEquals(expected, actual);
    }
}

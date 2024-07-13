package com.org.shoppingcart;

import com.org.shoppingcart.exception.InvalidProductDataException;
import com.org.shoppingcart.exception.InvalidProductNameException;
import com.org.shoppingcart.exception.InvalidProductPriceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void shouldThrowInvalidProductNameExceptionIfProductNameIsInvalid() throws InvalidProductDataException {
        // arrange
        String productName = null;
        double price = 50.50;

        // act && assert
        assertThrows(InvalidProductNameException.class, () -> {
            Product.create(productName, price);
        });
    }

    @Test
    void shouldThrowInvalidProductPriceExceptionIfProductPriceIsLessThanZero() throws InvalidProductDataException {
        // arrange
        String productName = "SchoolBag";
        double price = -1;

        // act && assert
        assertThrows(InvalidProductPriceException.class, () -> {
            Product.create(productName, price);
        });
    }

}

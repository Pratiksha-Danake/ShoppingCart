package com.org.shoppingcart;

import com.org.shoppingcart.exception.InvalidProductDataException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartTest {
    @Test
    void shouldBeAbleToCreateEmptyShoppingCart() {
        // arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        // act && assert
        assertTrue(shoppingCart.getCart().size() == 0);
    }

    @Test
    void shouldBeAbleToAddProductToShoppingCart() throws InvalidProductDataException {
        // arrange
        Product product = Product.create("Laptop", 100000);
        ShoppingCart shoppingCart = new ShoppingCart();

        // act
        shoppingCart.addProduct(product);

        // assert
        assertTrue(shoppingCart.getCart().size() == 1);

    }
}

package com.org.shoppingcart;

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
}

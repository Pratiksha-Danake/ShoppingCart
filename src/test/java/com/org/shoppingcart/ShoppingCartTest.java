package com.org.shoppingcart;

import com.org.shoppingcart.exception.InvalidProductDataException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;

    @BeforeEach
    void initialize() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    void shouldBeAbleToCreateEmptyShoppingCart() {
        // arrange

        // act && assert
        assertEquals(0, shoppingCart.getCart().size());
    }

    @Test
    void shouldBeAbleToAddProductToShoppingCart() throws InvalidProductDataException {
        // arrange
        Product product = Product.create("Laptop", 100000);

        // act
        shoppingCart.addProduct(product);

        // assert
        assertEquals(1, shoppingCart.getCart().size());
    }

    @Test
    void shouldBeAbleToPurchaseProductAddedInShoppingCart() throws InvalidProductDataException {
        // arrange
        String productNameToPurchase = "Laptop";

        // act
        shoppingCart.purchase(productNameToPurchase);

        // assert
        assertEquals(0, shoppingCart.getCart().size());
    }
}

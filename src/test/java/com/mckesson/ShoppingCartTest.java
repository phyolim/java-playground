package com.galvanize;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShoppingCartTest {
    ShoppingCart cart;
    @Before
    public void setup(){
        cart = new ShoppingCart();
    }

    @Test
    public void newCartIsEmpty(){
        assertTrue(cart.isEmpty());
    }

    @Test
    public void cartAddItemWithtArgs(){
        Item item = new Item("aa123", "widget", 11.99f);
        cart.addItem(6, item);
    }
}

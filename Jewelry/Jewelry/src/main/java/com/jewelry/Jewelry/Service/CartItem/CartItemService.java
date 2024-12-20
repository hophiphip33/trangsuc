package com.jewelry.Jewelry.Service.CartItem;

import com.jewelry.Jewelry.Model.CartItem;

import java.util.List;
import java.util.Optional;

public interface CartItemService {
    List<CartItem> getAllCartItems();
    Optional<CartItem> getCartItemById(Long id);
    CartItem createCartItem(CartItem cartItem);
    CartItem updateCartItem(Long id, CartItem cartItem);
    void deleteCartItem(Long id);
}

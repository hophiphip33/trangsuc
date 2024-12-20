package com.jewelry.Jewelry.Service.Cart;

import com.jewelry.Jewelry.Model.Cart;

import java.util.List;
import java.util.Optional;

public interface CartService {
    List<Cart> getAllCarts();
    Optional<Cart> getCartById(Long id);
    Cart createCart(Cart cart);
    Cart updateCart(Long id, Cart cart);
    void deleteCart(Long id);
}

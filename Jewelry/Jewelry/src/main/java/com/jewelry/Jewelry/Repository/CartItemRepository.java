package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByCartId(Long cartId); // Tìm sản phẩm trong giỏ hàng theo ID giỏ hàng
}

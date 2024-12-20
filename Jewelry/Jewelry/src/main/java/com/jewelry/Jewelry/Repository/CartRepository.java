package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId); // Tìm giỏ hàng theo ID người dùng
}

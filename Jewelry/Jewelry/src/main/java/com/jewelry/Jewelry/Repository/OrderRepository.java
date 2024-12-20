package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId); // Tìm đơn hàng theo ID người dùng
}

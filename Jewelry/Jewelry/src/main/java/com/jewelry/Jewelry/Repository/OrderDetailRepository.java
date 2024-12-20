package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findByOrderId(Long orderId); // Tìm chi tiết đơn hàng theo Order ID
}

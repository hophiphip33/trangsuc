package com.jewelry.Jewelry.Service.OrderDetail;

import com.jewelry.Jewelry.Model.OrderDetail;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    List<OrderDetail> getAllOrderDetails();
    Optional<OrderDetail> getOrderDetailById(Long id);
    OrderDetail createOrderDetail(OrderDetail orderDetail);
    OrderDetail updateOrderDetail(Long id, OrderDetail orderDetail);
    void deleteOrderDetail(Long id);
}

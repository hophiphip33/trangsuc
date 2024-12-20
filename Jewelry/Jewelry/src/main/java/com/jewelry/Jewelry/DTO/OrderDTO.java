package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long id;                     // ID của đơn hàng
    private Long userId;                 // ID của người dùng đặt hàng
    private List<OrderDetailDTO> items;  // Danh sách sản phẩm trong đơn hàng
    private double totalAmount;          // Tổng giá trị của đơn hàng
    private String status;               // Trạng thái đơn hàng (Pending, Paid, Shipped, ...)
}

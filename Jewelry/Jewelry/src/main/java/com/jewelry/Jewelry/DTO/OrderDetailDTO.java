package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDTO {
    private Long id;           // ID của chi tiết đơn hàng
    private Long orderId;      // ID của đơn hàng liên quan
    private Long jewelryId;    // ID của sản phẩm
    private int quantity;      // Số lượng sản phẩm
    private double price;      // Giá sản phẩm tại thời điểm đặt hàng
}

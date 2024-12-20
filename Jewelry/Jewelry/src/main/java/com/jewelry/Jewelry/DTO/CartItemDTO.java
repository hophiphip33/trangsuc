package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long id;
    private Long jewelryId;  // ID của sản phẩm trang sức
    private int quantity;    // Số lượng sản phẩm
    private double totalPrice; // Tổng giá trị của item (quantity * jewelry price)


}

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
public class CartDTO {

    private Long id;
    private Long userId;      // ID của người dùng
    private List<CartItemDTO> cartItems; // Danh sách các mục giỏ hàng
}

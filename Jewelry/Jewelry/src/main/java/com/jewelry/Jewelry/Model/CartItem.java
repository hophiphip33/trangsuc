package com.jewelry.Jewelry.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;  // Giỏ hàng chứa sản phẩm

    @ManyToOne
    @JoinColumn(name = "jewelry_id")
    private Jewelry jewelry;  // Sản phẩm trong giỏ hàng

    private int quantity;  // Số lượng của sản phẩm trong giỏ hàng
}

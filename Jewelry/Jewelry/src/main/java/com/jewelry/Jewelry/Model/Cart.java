package com.jewelry.Jewelry.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;  // Người sở hữu giỏ hàng

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CartItem> items;  // Các sản phẩm trong giỏ hàng

    private double totalPrice;  // Tổng giá trị giỏ hàng

    public void calculateTotalPrice() {
        totalPrice = items.stream()
                .mapToDouble(item -> item.getJewelry().getPrice() * item.getQuantity())
                .sum();
    }
}

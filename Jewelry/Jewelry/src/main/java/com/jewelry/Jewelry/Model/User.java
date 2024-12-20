package com.jewelry.Jewelry.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;

    private String role; // Thêm trường role để phân quyền

    // Có thể là "USER" hoặc "ADMIN"
    public boolean isAdmin() {
        return "ADMIN".equals(this.role);
    }
}

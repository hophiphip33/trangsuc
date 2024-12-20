package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;           // ID người dùng
    private String username;   // Tên đăng nhập
    private String email;      // Email
    private String phone;      // Số điện thoại
    private String address;    // Địa chỉ
    private String role;       // Vai trò của người dùng
}

package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MaterialDTO {
    private Long id;         // ID của vật liệu
    private String name;     // Tên vật liệu (vàng, bạc, kim cương,...)
    private String description; // Mô tả vật liệu
}

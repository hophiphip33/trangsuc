package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JewelryDTO {

    private Long id;
    private String name;          // Tên trang sức
    private String description;   // Mô tả
    private double price;         // Giá trang sức
    private String imageUrl;      // URL của hình ảnh trang sức
    private String category;      // Thể loại của trang sức
}

package com.jewelry.Jewelry.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO {

    private Long id;
    private String fileName;    // Tên file của ảnh
    private String fileType;    // Loại file (ví dụ: PNG, JPG)
    private String downloadUrl; // URL tải ảnh
    private Long jewelryId;     // ID của sản phẩm trang sức mà ảnh thuộc về
}

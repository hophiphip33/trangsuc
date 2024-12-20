package com.jewelry.Jewelry.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String fileType;

    @Lob
    private Blob image; // Lưu dữ liệu nhị phân của hình ảnh

    private String downloadUrl;

    @ManyToOne
    private Jewelry jewelry; // Thay Product bằng Jewelry

    public Image(String fileName, String fileType, Blob image, String downloadUrl) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.image = image;
        this.downloadUrl = downloadUrl;
    }
}

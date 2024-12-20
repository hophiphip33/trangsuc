package com.jewelry.Jewelry.Service.Image;

import com.jewelry.Jewelry.Model.Image;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    List<Image> getAllImages();
    Optional<Image> getImageById(Long id);
    Image createImage(Image image);
    Image updateImage(Long id, Image image);
    void deleteImage(Long id);
}

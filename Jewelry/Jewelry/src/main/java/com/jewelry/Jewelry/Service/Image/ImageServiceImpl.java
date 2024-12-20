package com.jewelry.Jewelry.Service.Image;

import com.jewelry.Jewelry.Model.Image;
import com.jewelry.Jewelry.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public Optional<Image> getImageById(Long id) {
        return imageRepository.findById(id);
    }

    @Override
    public Image createImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image updateImage(Long id, Image image) {
        Optional<Image> existingImage = imageRepository.findById(id);
        if (existingImage.isPresent()) {
            Image updatedImage = existingImage.get();
            updatedImage.setFileName(image.getFileName());
            updatedImage.setFileType(image.getFileType());
            updatedImage.setImage(image.getImage());
            updatedImage.setDownloadUrl(image.getDownloadUrl());
            return imageRepository.save(updatedImage);
        }
        throw new RuntimeException("Image not found with id " + id);
    }

    @Override
    public void deleteImage(Long id) {
        if (imageRepository.existsById(id)) {
            imageRepository.deleteById(id);
        } else {
            throw new RuntimeException("Image not found with id " + id);
        }
    }
}

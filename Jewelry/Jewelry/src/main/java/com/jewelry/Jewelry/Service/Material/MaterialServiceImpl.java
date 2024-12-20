package com.jewelry.Jewelry.Service.Material;

import com.jewelry.Jewelry.Model.Material;
import com.jewelry.Jewelry.Repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    @Override
    public Optional<Material> getMaterialById(Long id) {
        return materialRepository.findById(id);
    }

    @Override
    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public Material updateMaterial(Long id, Material material) {
        if (materialRepository.existsById(id)) {
            material.setId(id);
            return materialRepository.save(material);
        }
        return null;
    }

    @Override
    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}

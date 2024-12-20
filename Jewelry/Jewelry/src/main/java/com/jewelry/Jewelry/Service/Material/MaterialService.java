package com.jewelry.Jewelry.Service.Material;

import com.jewelry.Jewelry.Model.Material;

import java.util.List;
import java.util.Optional;

public interface MaterialService {
    List<Material> getAllMaterials();
    Optional<Material> getMaterialById(Long id);
    Material createMaterial(Material material);
    Material updateMaterial(Long id, Material material);
    void deleteMaterial(Long id);
}

package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
    Material findByName(String name); // Tìm theo tên material
}

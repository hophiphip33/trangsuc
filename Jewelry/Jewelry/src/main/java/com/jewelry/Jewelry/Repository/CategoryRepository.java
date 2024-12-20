package com.jewelry.Jewelry.Repository;

import com.jewelry.Jewelry.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findBySlug(String slug); // Tìm theo slug
    List<CategoryRepository> findByNameContainingIgnoreCase(String name);  // Tìm theo tên chứa chuỗi (không phân biệt chữ hoa/thường)

}

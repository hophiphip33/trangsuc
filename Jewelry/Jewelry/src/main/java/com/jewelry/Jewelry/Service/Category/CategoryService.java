package com.jewelry.Jewelry.Service.Category;

import com.jewelry.Jewelry.Model.Category;
import com.jewelry.Jewelry.Repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    List<CategoryRepository> getCategoryByName(String name);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}

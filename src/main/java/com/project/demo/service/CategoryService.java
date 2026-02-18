package com.project.demo.service;

import com.project.demo.models.Category;
import com.project.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category saveCategory(Category category) {
        // Podrías validar que el nombre no sea nulo aquí
        return categoryRepository.save(category);
    }
}
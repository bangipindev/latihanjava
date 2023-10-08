package com.latihan.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.models.entities.Category;
import com.latihan.models.repository.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category){
        return categoryRepository.save(category);
    }

    public Category findOne(Long id){
        Optional <Category> category = categoryRepository.findById(id);
        if(!category.isPresent()){
            return null;
        } 
        return category.get();
    }

    public Iterable<Category> findAll(){
        return categoryRepository.findAll();
    }

    public void removeOne(Long id){
        categoryRepository.deleteById(id);
    }
}

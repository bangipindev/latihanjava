package com.latihan.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.latihan.models.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findByNameContains(String name);
}

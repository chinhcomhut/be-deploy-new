package com.codegym.wbdlaptop.service;

import com.codegym.wbdlaptop.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Boolean existsByNameCategory(String nameCategory);
    Page<Category> findAllByUserId(Long userId, Pageable pageable);
    Page<Category> findAll(Pageable pageable);
    void delete(Long id);
    Category save(Category category);
    Optional<Category> findById(Long id);
    List<Category> findAllList();
}

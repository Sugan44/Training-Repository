package com.example.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.supermarket.ProductCategory.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

	
}

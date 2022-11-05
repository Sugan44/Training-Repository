package com.example.supermarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supermarket.PCindujuval.IdNotFound;
import com.example.supermarket.ProductCategory.ProductCategory;
import com.example.supermarket.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
	@Autowired
	ProductCategoryRepository pr;
	
	public String addcategory(ProductCategory p) {
		pr.save(p);
		return "Product Category Added";
	}

	public ProductCategory getbyid(int a) {
		return pr.findById(a).orElseThrow(()-> new IdNotFound());
	}

}

package com.example.supermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.supermarket.ProductCategory.ProductCategory;
import com.example.supermarket.service.ProductCategoryService;

@RestController
public class ProductCategoryController {
	@Autowired
	ProductCategoryService ps;  
  	
	@PostMapping(value="/addcategory")
	public String addcategory(@RequestBody ProductCategory p) {
		return ps.addcategory(p);
	}
	@GetMapping(value="/getcategorybyid/{a}")
	public ProductCategory getbyid(@PathVariable int a) {
		return ps.getbyid(a);
	}

}

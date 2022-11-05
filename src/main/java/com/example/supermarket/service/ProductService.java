package com.example.supermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supermarket.product.Product;
import com.example.supermarket.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository pr;
	
	public String addproduct(Product p) {
		pr.save(p);
		return "Product Added Successfully";
	}
	//--------------------
	public List<Product> getoverall() {
		return pr.getoverall();
	}
	

}

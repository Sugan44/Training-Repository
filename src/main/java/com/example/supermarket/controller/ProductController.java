package com.example.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.supermarket.product.Product;
import com.example.supermarket.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	
	@PostMapping(value="/addproduct")
	public String addproduct(@RequestBody Product p) {
		return ps.addproduct(p);
	}
	//----------------------
	@GetMapping(value="/getoverall")
	public List<Product> getoverall() {
		return ps.getoverall();
	}

}

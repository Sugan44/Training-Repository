package com.example.supermarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.supermarket.product.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query (value="select supermarket.product.id, supermarket.product.name, supermarket.product.price, supermarket.product.hsn, supermarket.product.pcid, supermarket.productcategory.name \r\n"
			+ "from supermarket.product\r\n"
			+ "inner join supermarket.productcategory\r\n"
			+ "on supermarket.product.pcid=supermarket.productcategory.id", nativeQuery = true)
public List<Product> getoverall();

}

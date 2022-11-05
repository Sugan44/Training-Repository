package com.example.supermarket.ProductCategoryExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.supermarket.PCindujuval.IdNotFound;

@ControllerAdvice
public class ProductCategoryExceptions {
	
	@ExceptionHandler(value=IdNotFound.class)
	public ResponseEntity <Object> exe() {
		return new ResponseEntity <> ("Product Not Found For this ID", HttpStatus.NOT_FOUND);
		
	}

}

package com.example.ProductController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping(path="/saveProduct")
	public String saveProduct() {
		return "Products saved.";
	}
	@GetMapping(path="/getProduct")
	public String getProduct() {
		return "Products";
	}

}

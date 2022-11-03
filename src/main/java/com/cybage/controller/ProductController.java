package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Product;
import com.cybage.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}

	@RequestMapping(method = RequestMethod.POST, value="/products")
	public void addProduct(@RequestBody Product product)
	{
		productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/products")
	public void updateProduct(@RequestBody Product product)
	{
		productService.addProduct(product);
	}
}

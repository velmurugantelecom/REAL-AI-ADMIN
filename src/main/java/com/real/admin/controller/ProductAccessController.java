package com.real.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.real.admin.entity.Product;
import com.real.admin.service.ProductService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class ProductAccessController {



	@Autowired
	ProductService productService;


	@PostMapping(path = "/addOrUpdateProduct", produces = "application/json")
	public Product addAdmin(@RequestBody Product product) {
	
		return productService.addOrUpdateProduct(product);
	}
	@GetMapping(path = "/productList", produces = "application/json")
	public List<Product> getAdminList() {
		return productService.getProductList();
	}

	@DeleteMapping(path = "/deleteProduct/{productId}", produces = "application/json")
	public void deleteProduct(@PathVariable("productId") String productId) {
		productService.deleteProduct(Long.valueOf(productId));
	}


	

}
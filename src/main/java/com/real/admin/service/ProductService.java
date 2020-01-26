package com.real.admin.service;

import java.util.List;

import com.real.admin.entity.Product;


public interface ProductService {
	
	public List<Product> getProductList();
	
	public Product addOrUpdateProduct(Product product) ;
	
	public void deleteProduct(Long productId);
	
	
}
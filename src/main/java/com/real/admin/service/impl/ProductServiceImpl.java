package com.real.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.real.admin.entity.Product;
import com.real.admin.jpa.repository.ProductRepository;
import com.real.admin.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	MessageSource messageSource;

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getProductList() {
		return productRepository.findAll();

	}

	@Override
	public Product addOrUpdateProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);
	}

}
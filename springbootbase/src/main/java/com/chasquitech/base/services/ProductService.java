package com.chasquitech.base.services;

import com.chasquitech.base.domain.Product;

public interface ProductService {
	
	Iterable<Product> listAllProducts();
	
	Product getProductById(Integer id);
	
	Product saveProduct(Product product);
	
	void deleteProduct(Integer id);

}

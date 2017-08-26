package com.chasquitech.base.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chasquitech.base.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	
	
}

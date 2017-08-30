package com.chasquitech.base.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chasquitech.base.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUsername(String username);
	
}

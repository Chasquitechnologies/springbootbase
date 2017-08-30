package com.chasquitech.base.services;

import com.chasquitech.base.domain.User;

public interface UserService extends CRUDService<User> {
	 
    User findByUsername(String username);
 
}

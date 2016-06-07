package com.herb.repositories;

import org.springframework.data.repository.CrudRepository;

import com.herb.domain.LoginedUser;
import com.herb.domain.User;

public interface LoginedUserRepository extends CrudRepository<LoginedUser, Long> {

	
    User findByUser_id(Long id);

	@Override
	void delete(Long arg0);

	@Override
	LoginedUser findOne(Long arg0);

	@Override
	<S extends LoginedUser> S save(S loginedUser);
    
}
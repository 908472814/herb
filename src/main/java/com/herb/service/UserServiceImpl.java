package com.herb.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.herb.domain.User;
import com.herb.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	private static Logger logger = LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public  User quertUser(Long userId){
		logger.info("quertUser start "+userId);
		return	userRepository.findOne(userId);
	}

	@Override
	public User quertUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> queryByName(String name) {
		Pageable pageable = new PageRequest(0, 20);
		return this.userRepository.findByName(name,pageable);
	}
	
	
}

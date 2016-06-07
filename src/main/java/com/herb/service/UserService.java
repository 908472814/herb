package com.herb.service;

import org.springframework.data.domain.Page;

import com.herb.domain.User;

public interface UserService {
	User quertUser(Long userId);
	User quertUser(User user);
	Page<User> queryByName(String name);
}
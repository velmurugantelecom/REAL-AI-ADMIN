package com.real.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.real.admin.entity.User;
import com.real.admin.jpa.repository.UserRepository;
import com.real.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	MessageSource messageSource;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getUserList() {
		return userRepository.findAll();

	}

	@Override
	public User addOrUpdateUser(User user) {
		return userRepository.save(user);

	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

}
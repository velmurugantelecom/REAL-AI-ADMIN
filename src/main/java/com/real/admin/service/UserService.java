package com.real.admin.service;

import java.util.List;

import com.real.admin.entity.User;


public interface UserService {
	
	public List<User> getUserList();
	
	public User addOrUpdateUser(User user) ;
	
	public void deleteUser(Long userId);
	
	
}
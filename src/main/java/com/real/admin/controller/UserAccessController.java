package com.real.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.real.admin.entity.User;
import com.real.admin.service.UserService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class UserAccessController {



	@Autowired
	UserService userService;


	@PostMapping(path = "/addOrUpdateUser", produces = "application/json")
	public User addAdmin(@RequestBody User user) {
	
		return userService.addOrUpdateUser(user);
	}
	@GetMapping(path = "/userList", produces = "application/json")
	public List<User> getAdminList() {
		return userService.getUserList();
	}

	@DeleteMapping(path = "/deleteUser/{userId}", produces = "application/json")
	public void deleteUser(@PathVariable("userId") String userId) {
		userService.deleteUser(Long.valueOf(userId));
	}


	

}
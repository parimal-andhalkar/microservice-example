package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.pojo.User;

@Service
public class UserService {

	List<User> userList = List.of(
			new User(1, "Ram", "Tiwari"),
			new User(2, "Shyam", "Dube"), 
			new User(3, "AAAA", "FD"),
			new User(4, "Adv", "Thk"));

	public User getUser(int userId) {

		return userList.get(userId);
	}
}

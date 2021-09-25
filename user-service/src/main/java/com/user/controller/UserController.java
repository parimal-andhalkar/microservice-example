package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.pojo.Contact;
import com.user.pojo.User;
import com.user.service.ContactInfo;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ContactInfo contactInfo;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") int userId) {

		List<Contact> contactList =contactInfo.getContactDetails(userId);
		User user = userService.getUser(userId);
		user.setContacts(contactList);
		return user;
	}
	
	

}

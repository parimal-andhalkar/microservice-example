package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.pojo.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	
	@Autowired
	ContactService contactService;
	
	@GetMapping("/{userid}")
	public List<Contact> getContacts(@PathVariable("userid") int userID){
		
		return contactService.getContact(userID);
	}
}

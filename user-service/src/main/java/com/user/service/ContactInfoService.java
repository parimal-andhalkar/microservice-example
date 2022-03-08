package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.user.pojo.Contact;

@Service
public class ContactInfoService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getContactDetailsDownTime")
	public List<Contact> getContactDetails(int userId){
		
		List contactList = restTemplate.getForObject("http://CONTACT-SERVICE/contact/" + userId, List.class);
		
		return contactList;
	}

	public List<Contact> getContactDetailsDownTime(int userId) {
		
		List<Contact> list = new ArrayList<>();
		
		Contact contact = new Contact();
		contact.setEmail("From Circuit breaker");
		contact.setMobile("From Circuit breaker");
		contact.setUserId("From Circuit breaker");
		contact.setId(userId);
		
		list.add(contact);
		
		return list;
	}

}

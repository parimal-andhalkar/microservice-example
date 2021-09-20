package com.contact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.pojo.Contact;

@Service
public class ContactService {

	List<Contact> contactList = List.of(
			new Contact(1, "99999", "abc@aaaa.com", 1),
			new Contact(2, "8888", "abc@aaaa.com", 1),
			new Contact(3, "7777", "abc@aaaa.com", 2),
			new Contact(4, "4444", "abc@aaaa.com", 2),
			new Contact(5, "3333", "abc@aaaa.com", 3),
			new Contact(6, "111111", "abc@aaaa.com", 4),
			new Contact(7, "22222", "abc@aaaa.com", 2),
			new Contact(8, "756555", "abc@aaaa.com", 1),
			new Contact(9, "323244", "abc@aaaa.com", 2),
			new Contact(10, "5654757", "abc@aaaa.com", 1));
	
	public List<Contact> getContact(int userId)
	{
		List<Contact> result = new ArrayList<>();
		for(Contact ct : contactList) {
			if(userId == ct.getUserId())
			{
				result.add(ct);
			}
		}
		
		return result;
	}
}

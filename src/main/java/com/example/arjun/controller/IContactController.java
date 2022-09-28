package com.example.arjun.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.arjun.dto.ContactDto;
import com.example.arjun.service.IContactService;


@RestController
@CrossOrigin
public class IContactController {
	@Autowired
	private IContactService contactService;
	 @PostMapping("/contact")
	    public boolean contactUs(@RequestBody ContactDto contact){
	        return contactService.saveMessage(contact);
	    }

}

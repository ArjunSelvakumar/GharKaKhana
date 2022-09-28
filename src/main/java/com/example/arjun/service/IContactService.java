package com.example.arjun.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import com.example.arjun.repository.IContactRepository;
import com.example.arjun.dto.ContactDto;

@Service
public class IContactService {
	@Autowired 
	private IContactRepository contactRepository;
	
	 public boolean saveMessage(ContactDto contact){
	        contactRepository.save(contact);
	        return true;
	    }
}

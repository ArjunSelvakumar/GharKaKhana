package com.example.arjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.arjun.dto.ContactDto;
import com.example.arjun.entity.Contact;

public interface IContactRepository extends JpaRepository<Contact,Integer> {

	void save(ContactDto contact);

}

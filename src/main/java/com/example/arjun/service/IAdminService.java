package com.example.arjun.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.arjun.dto.AdminDto;
import com.example.arjun.entity.Admin;
import com.example.arjun.entity.User;
import com.example.arjun.exception.WrongPasswordException;
import com.example.arjun.repository.IAdminRepository;
import com.example.arjun.repository.IUserRepository;

@Service
@Transactional
public class IAdminService {
	@Autowired
	IUserRepository userRepository;
	@Autowired
	IAdminRepository adminRepository;
	
	 public List<User> getUsers(){
	    	return userRepository.findAll();
	 }
	   public Admin adminSignIn(AdminDto admin) throws WrongPasswordException {
	        Admin admin1 = adminRepository.findBymailId(admin.getMailId());
	        if (admin1 != null && admin.getPassword().equals(admin1.getPassword())) {
	        	return admin1;
	        } else {
	            throw new WrongPasswordException("Wrong Password");
	            
	        }
	        
	    }
	 
	 public User removeUser(int userId) {
			Optional<User> container = userRepository.findById(userId);
			if (container.isPresent()) {
				User result = container.get();
				userRepository.delete(result);
				return result;
			}
			return null;
		}

		public User viewUser(int userId) {
			Optional<User> container = userRepository.findById(userId);
			if (container.isPresent()) {
				return container.get();
			}
			return null;
		}
}
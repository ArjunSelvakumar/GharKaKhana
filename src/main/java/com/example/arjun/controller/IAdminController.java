package com.example.arjun.controller;

import java.util.List;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.arjun.dto.AdminDto;
import com.example.arjun.entity.Admin;
import com.example.arjun.entity.User;
import com.example.arjun.service.IAdminService;
import com.example.arjun.service.IUserService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Admin")
public class IAdminController {
	@Autowired
	IAdminService adminService;
	IUserService userService;
	
	 @PostMapping("/login")
	    public ResponseEntity<Admin> login(@RequestBody AdminDto admin, HttpSession session) {
	        Admin admininfo = adminService.adminSignIn(admin);
	        if (admininfo != null) {
	            session.setAttribute("admin", admininfo);
	            return new ResponseEntity<>(admininfo, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }
	    }
	
	 @GetMapping("/list")
	    public List<User> getUsers(){
	    	return userService.getUsers();
	    }
	 @DeleteMapping("/deleteUser/{UserId}")
	    public User removeUser(@PathVariable int userId) {
	        return adminService.removeUser(userId);
	    }

	    @GetMapping("/viewUser/{UserId}")
	    public User viewUser(@PathVariable int userId) {
	        return adminService.viewUser(userId);
	    }
	 
}

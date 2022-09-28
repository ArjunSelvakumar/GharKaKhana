package com.example.arjun.dto;

public class ContactDto {
	private int id;
	private String email;
	private String name;
	private String message;
	public ContactDto() {
		super();
	}
	public ContactDto(int id, String email, String name, String message) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactDto [id=" + id + ", email=" + email + ", name=" + name + ", message=" + message + "]";
	}
	
}
package com.example.arjun.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserDto implements Serializable {
	
	private boolean merchant;
	private String mail;
	private String address;
	private String phone;
	private String lastName;
	private String firstName;
	private String userName;
	private String password;
	public UserDto() {
		super();
	
	}
	public UserDto(boolean merchant, String mail, String address, String phone, String lastName, String firstName,
			String userName, String password) {
		super();
		this.merchant = merchant;
		this.mail = mail;
		this.address = address;
		this.phone = phone;
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
	}
	public boolean isMerchant() {
		return merchant;
	}
	public void setMerchant(boolean merchant) {
		this.merchant = merchant;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [merchant=" + merchant + ", mail=" + mail + ", address=" + address + ", phone=" + phone
				+ ", lastName=" + lastName + ", firstName=" + firstName + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
}
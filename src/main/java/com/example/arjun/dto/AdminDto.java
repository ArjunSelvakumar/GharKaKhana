package com.example.arjun.dto;

public class AdminDto {
	private String mailId;
    private String password;
	public AdminDto() {
		super();
	
	}
	public AdminDto(String mailId, String password) {
		super();
		this.mailId = mailId;
		this.password = password;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDto [mailId=" + mailId + ", password=" + password + "]";
	}
}

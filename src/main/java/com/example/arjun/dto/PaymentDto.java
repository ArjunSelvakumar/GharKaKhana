package com.example.arjun.dto;

public class PaymentDto {
	private Integer paymentId;
	private String cardNumber;
	private String cardName;
	private String cardExpiry;
	private String bankName;
	private String status;
	public PaymentDto() {
		super();
	}
	public PaymentDto(Integer paymentId, String cardNumber, String cardName, String cardExpiry, String bankName,
			String status) {
		super();
		this.paymentId = paymentId;
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cardExpiry = cardExpiry;
		this.bankName = bankName;
		this.status = status;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PaymentDto [paymentId=" + paymentId + ", cardNumber=" + cardNumber + ", cardName=" + cardName
				+ ", cardExpiry=" + cardExpiry + ", bankName=" + bankName + ", status=" + status + "]";
	}
	
	}
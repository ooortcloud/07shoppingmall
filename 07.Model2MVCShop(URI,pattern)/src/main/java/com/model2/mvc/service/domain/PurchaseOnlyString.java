package com.model2.mvc.service.domain;


import java.sql.Date;

public class PurchaseOnlyString {
	
	private String divyAddr;   // demailaddr
	private String divyDate;  // dlvy_date
	private String divyRequest;   // dlvy_request
	private String paymentOption;  // payment_option
	private String receiverName;  // receiver_name
	private String receiverPhone;  // receiver_phone
	private String tranCode;  // tran_status_code (1~3)
	
	public PurchaseOnlyString(){
	}

	public String getDivyAddr() {
		return divyAddr;
	}
	public void setDivyAddr(String divyAddr) {
		this.divyAddr = divyAddr;
	}
	public String getDivyDate() {
		return divyDate;
	}
	public void setDivyDate(String divyDate) {
		this.divyDate = divyDate;
	}
	public String getDivyRequest() {
		return divyRequest;
	}
	public void setDivyRequest(String divyRequest) {
		this.divyRequest = divyRequest;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getTranCode() {
		return tranCode;
	}
	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Purchase [divyAddr=");
		builder.append(divyAddr);
		builder.append(", divyDate=");
		builder.append(divyDate);
		builder.append(", divyRequest=");
		builder.append(divyRequest);
		builder.append(", paymentOption=");
		builder.append(paymentOption);
		builder.append(", receiverName=");
		builder.append(receiverName);
		builder.append(", receiverPhone=");
		builder.append(receiverPhone);
		builder.append(", tranCode=");
		builder.append(tranCode);
		builder.append("]");
		return builder.toString();
	}
}
package com.mkyong.model;

import org.springframework.stereotype.Repository;

@Repository
public class AddMoney {
private String userId;
private String recevierUserid;
private String accountNumber;
private String recevierNumber;
private String requestNumber;
private int amount;
private int sendamount;
public String getRecevierUserid() {
	return recevierUserid;
}
public void setRecevierUserid(String recevierUserid) {
	this.recevierUserid = recevierUserid;
}
public String getRecevierNumber() {
	return recevierNumber;
}
public void setRecevierNumber(String recevierNumber) {
	this.recevierNumber = recevierNumber;
}
public String getRequestNumber() {
	return requestNumber;
}
public void setRequestNumber(String requestNumber) {
	this.requestNumber = requestNumber;
}
public int getSendamount() {
	return sendamount;
}
public void setSendamount(int sendamount) {
	this.sendamount = sendamount;
}
public int getRequestamount() {
	return requestamount;
}
public void setRequestamount(int requestamount) {
	this.requestamount = requestamount;
}
private int requestamount;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}

package com.mkyong.model;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionDetails {
	private String userid;
	private String accountnumber;
	private int withdrawl;
	private int credit;
	private String timestamp;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}

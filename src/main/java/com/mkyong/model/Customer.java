package com.mkyong.model;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class Customer {

private String first_name;
private String last_name;
private String userid;

public String getUSERID() {
	return userid;
}
public void setUSERID(String uSERID) {
	this.userid = uSERID;
}
public String getfirst_name() {
	return first_name;
}
public void setfirst_name(String first_name) {
	this.first_name = first_name;
}
public String getlast_name() {
	return last_name;
}
public void setlast_name(String last_name) {
	this.last_name = last_name;
}

}

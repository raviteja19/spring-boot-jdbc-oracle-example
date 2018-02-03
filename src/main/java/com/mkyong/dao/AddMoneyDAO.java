package com.mkyong.dao;

import java.util.Date;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkyong.model.AddMoney;

@Repository
public class AddMoneyDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public boolean addMoney(AddMoney addmoney)
    {
    	Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
    	String queryDate,qerytransaction,queryadd,query="select balance from USER_ACCOUNT_DETAILS where USERID= ? and ACCOUNT_NUMBER = ?";
        
    	int count;	
        try {
             count=jdbcTemplate.queryForObject(query, new Object[]{addmoney.getUserId(),addmoney.getAccountNumber()}, Integer.class);
        	 count+=addmoney.getAmount();
        	 qerytransaction="insert into USER_TRANSACTION_DETAILS values(?,?,?,?,?)";	 
       	 queryadd ="update USER_ACCOUNT_DETAILS set BALANCE=? where USERID=? and ACCOUNT_NUMBER =?";
       	queryDate="select to_char(systimestamp, 'dd-mon-yyyy hh.mi.ss') as time from dual";
       	       	 int status= jdbcTemplate.update(queryadd,count,addmoney.getUserId(),addmoney.getAccountNumber()); 
       	int status1=jdbcTemplate.update(qerytransaction,addmoney.getUserId(),addmoney.getAccountNumber(),0,count,getCurrentDate());
       	 System.out.println(count+"----"+status1+"--------"+status+"----"+getCurrentDate());
       	 return true;
        } catch (EmptyResultDataAccessException e) {
        	System.out.println("----error");
        	return false;
        }
        
 
    }
    private static String getCurrentDate() {
    	Date dt = new Date();
       	SimpleDateFormat sdf = 
       	     new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       	return sdf.format(dt);

    }
}

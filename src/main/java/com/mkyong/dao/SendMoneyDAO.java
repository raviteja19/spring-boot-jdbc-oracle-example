package com.mkyong.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkyong.model.AddMoney;

@Repository
public class SendMoneyDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	public boolean sendMoney(AddMoney sendmoney)
    {
    	String querysendAmount,queryreceiveamount,query="select BALANCE from USER_ACCOUNT_DETAILS where userid =? and ACCOUNT_NUMBER=?"
    			,queryReceive="";  
    	querysendAmount="update USER_ACCOUNT_DETAILS set balance=? where userid=?";
    	queryreceiveamount="update USER_ACCOUNT_DETAILS set balance=? where userid=?";
    	int balance =jdbcTemplate.queryForObject(
    			query, new Object[] { sendmoney.getUserId(),sendmoney.getAccountNumber() }, Integer.class);
        if(balance>0&&balance>sendmoney.getAmount())
        {
        	balance =balance-sendmoney.getAmount();
 	       	 int status= jdbcTemplate.update(querysendAmount,balance,sendmoney.getAccountNumber());
        	return true;
        }
    	
    	return true;
    }
	 private static String getCurrentDate() {
	    	Date dt = new Date();
	       	SimpleDateFormat sdf = 
	       	     new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	       	return sdf.format(dt);

	    }
}

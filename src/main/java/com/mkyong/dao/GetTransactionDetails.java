package com.mkyong.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkyong.model.TransactionDetails;
@Repository
public class GetTransactionDetails {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<TransactionDetails> getDetailedTransaction(String userid)
    {
    	String queryFetchData="SELECT  * FROM USER_TRANSACTION_DETAILS where userid =?";
    	List<TransactionDetails> fetchdata=null;
    	fetchdata=jdbcTemplate.query(queryFetchData,new Object[] { userid}, new BeanPropertyRowMapper(TransactionDetails.class));
     
        
 return fetchdata;
    }
 

}

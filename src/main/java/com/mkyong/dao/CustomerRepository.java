package com.mkyong.dao;

import com.mkyong.model.Customer;
import com.mkyong.model.UserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    Customer c;
    public List<Customer> findAll(UserData data) {
    	String queryFetchData,query="select count(*) from user_login where userid =? and password=?";  
    	queryFetchData="SELECT  USERID,LAST_NAME,FIRST_NAME FROM USER_ACCOUNT_DETAILS where userid =?";
    	List<Customer> fetchdata=null;
    	int count =jdbcTemplate.queryForObject(
    			query, new Object[] { data.getUsername(),data.getPassword() }, Integer.class);
       
        if(count>0)
        { 
        	fetchdata=jdbcTemplate.query(queryFetchData,new Object[] { data.getUsername()}, new BeanPropertyRowMapper(Customer.class));
     
        	return fetchdata;
        }
        else
        {
        	
        	return fetchdata;
        }
        

    }
public List<Customer> isValid(String id,String pass)
{
	/*List<Customer> result = jdbcTemplate.query(
            "SELECT  userid, password, valid FROM user_login where userid="+id+"and password="+pass,
            (rs, rowNum) -> new Customer(rs.getString("userid"),
                     rs.getString("valid"))
    );*/

    return null;
}
}

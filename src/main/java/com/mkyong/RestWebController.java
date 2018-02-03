package com.mkyong;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mkyong.dao.AddMoneyDAO;
import com.mkyong.dao.CustomerRepository;
import com.mkyong.model.AddMoney;
import com.mkyong.model.Customer;
import com.mkyong.model.UserData;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(maxAge = 3600)
@RestController

public class RestWebController {
	 @Autowired
	    CustomerRepository customerRepository;
	 List<Customer> fetchdata=null;
@RequestMapping(value="/api/login",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON,produces= MediaType.APPLICATION_JSON )
	 public ResponseEntity<List> greet(@RequestBody UserData data)  {
		// l=customerRepository.isValid(data.getUsername(), data.getPassword());
	 fetchdata=customerRepository.findAll(data);
	 System.out.println(fetchdata);
	 if(fetchdata!=null) {
		 return new ResponseEntity<List>(fetchdata, HttpStatus.OK);}
	 else
	 {
		 return new ResponseEntity<List>(fetchdata, HttpStatus.INTERNAL_SERVER_ERROR);
	 }
	 }


}
 

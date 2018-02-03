package com.mkyong;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.dao.GetTransactionDetails;
import com.mkyong.model.TransactionDetails;
@CrossOrigin(maxAge = 3600)
@RestController

public class TransactionDetailsService {
	@Autowired
    GetTransactionDetails getDetails;
 List<TransactionDetails> fetchdata=null;
@RequestMapping(value="/api/transactiondetails",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON,produces= MediaType.APPLICATION_JSON )
 public ResponseEntity<List> getTransactionDetails(@RequestBody String data)  {
data="575226";
 fetchdata=getDetails.getDetailedTransaction(data);
System.out.println(fetchdata);
 if(fetchdata!=null) {
	 return new ResponseEntity<List>(fetchdata, HttpStatus.OK);}
 else
 {
	 return new ResponseEntity<List>(fetchdata, HttpStatus.INTERNAL_SERVER_ERROR);
 }
 }

}

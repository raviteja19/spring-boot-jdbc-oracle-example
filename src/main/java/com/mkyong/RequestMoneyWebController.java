package com.mkyong;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.model.AddMoney;
@CrossOrigin(maxAge = 3600)
@RestController
public class RequestMoneyWebController {
	@RequestMapping(value="/api/requestMoney",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON,produces= MediaType.APPLICATION_JSON )
	public ResponseEntity<Boolean> requestMoney(@RequestBody AddMoney addmoney)  {
		// l=customerRepository.isValid(data.getUsername(), data.getPassword());
		 System.out.println(addmoney.getRequestNumber()+"--"+addmoney.getRequestamount()+"--"+addmoney.getUserId());

		 return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}

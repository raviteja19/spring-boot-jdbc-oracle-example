package com.mkyong;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.dao.AddMoneyDAO;
import com.mkyong.dao.SendMoneyDAO;
import com.mkyong.model.AddMoney;
@CrossOrigin(maxAge = 3600)
@RestController
public class SendMoneyWebController {
	 @Autowired
	 SendMoneyDAO sendmoneydao;
	
	@RequestMapping(value="/api/sendMoney",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON,produces= MediaType.APPLICATION_JSON )
	public ResponseEntity<Boolean> sendMoney(@RequestBody AddMoney addmoney)  {

		 return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}

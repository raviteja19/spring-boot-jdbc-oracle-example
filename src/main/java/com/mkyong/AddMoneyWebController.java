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
import com.mkyong.model.AddMoney;
@CrossOrigin(maxAge = 3600)
@RestController
public class AddMoneyWebController {
	 @Autowired
	 AddMoneyDAO addmoneydao;
	@RequestMapping(value="/api/addMoney",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON,produces= MediaType.APPLICATION_JSON )
	public ResponseEntity<Boolean> addMoney(@RequestBody AddMoney addmoney)  {
		 		boolean result=addmoneydao.addMoney(addmoney);
		 		 return new ResponseEntity<Boolean>(result, HttpStatus.OK); 
		}

}

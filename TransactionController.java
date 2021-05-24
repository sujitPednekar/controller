package com.finance.layer5;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.finance.layer2.TransactionTable;
import com.finance.layer4.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService tranServ;
	
	 @GetMapping(path="/getTran/{mydno}") //Get Request in Postman http://localhost:8080/getDept/1
	    @ResponseBody
	    public TransactionTable getTransactionbyid(@PathVariable("mydno") Integer dno) {
	        System.out.println("Department Controller....Understanding client and talking to service layer...");
	        TransactionTable tran = tranServ.findTransactionService(dno);
	        return tran;        
	    }
	 
		@GetMapping(path="/getTrans")
		@ResponseBody
		public Set<TransactionTable> getAllDepartments() {
			System.out.println("Transaction Controller....Understanding client and talking to service layer...");
			Set<TransactionTable> deptList = tranServ.findAllTransactionsService();
			return deptList;
			
		}
		
		@GetMapping(path="/getTransByOrd/{myOrd}")
		@ResponseBody
		public Set<TransactionTable> getTranByOrderId(@PathVariable("myOrd") Integer ord) {
			System.out.println("Transaction Controller....Understanding client and talking to service layer...");
			Set<TransactionTable> deptList = tranServ.findTransactionsByOrderService(ord);
			return deptList;
			
		}
		
	}
	
	



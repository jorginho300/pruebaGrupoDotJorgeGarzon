package com.example.loan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.dao.LoanDAO;
import com.example.loan.view.Customer;

@RestController
@RequestMapping("loan")
public class LoansREST {
	
	Customer customer = new Customer();
	
	@Autowired
	private LoanDAO loanDAO;
	
	
	@GetMapping
	public String Hello() {
		return "Bienvenido a mi sistema";
	}
	
	@RequestMapping("/request/")
	public ResponseEntity<String> loanRequest(@RequestParam("amount") int amount) {
		
		return ResponseEntity.ok(customer.loanRequest(amount));
	}
	
	

}

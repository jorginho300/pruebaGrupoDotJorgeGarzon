package com.example.loan.view;

import com.example.loan.controller.AndresHandler;
import com.example.loan.controller.Handler;
import com.example.loan.controller.JuanHandler;
import com.example.loan.controller.LoanHandler;
import com.example.loan.controller.MariaHandler;

public class Customer {
	
	public static String loanRequest(int number) {
		
		Handler h1 = new LoanHandler();
		Handler h2 = new MariaHandler();
		Handler h3 = new JuanHandler();
		Handler h4 = new AndresHandler();
		
		h1.setNext(h2);
		h2.setNext(h3);
		h3.setNext(h4);
		String request = h1.process(number);
		return request;
	}

}

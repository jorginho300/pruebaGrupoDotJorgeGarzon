package com.example.loan.controller;

public abstract class Handler {
	
	private Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}
	
	public abstract String process(int number);

}

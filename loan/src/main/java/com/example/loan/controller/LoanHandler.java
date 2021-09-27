package com.example.loan.controller;

public class LoanHandler extends Handler{

	@Override
	public String process(int number) {
		if(number <= 0 || number > 7500000) {
			return "No hay socio disponible";
		} else {
			if(this.getNext() != null) {
				return this.getNext().process(number);
			} else {
				return "Buscando socio";
			}
		}
	}

}

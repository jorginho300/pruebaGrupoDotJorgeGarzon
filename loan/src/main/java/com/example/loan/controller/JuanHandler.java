package com.example.loan.controller;

import java.text.DecimalFormat;

public class JuanHandler extends Handler{

	@Override
	public String process(int number) {
		if(number > 3000000 && number <= 5000000) {
			double valorFuturo;
			double tasaInteres = 1.50;
			double periodoTiempo = 0.36;
			
			valorFuturo = number*(1+periodoTiempo*tasaInteres);
			double cuotaMensual = valorFuturo/periodoTiempo;
			DecimalFormat df = new DecimalFormat("#.00");
			String strLoan = "Resultado de la petición:";
			strLoan += "\nSocio: Juan";
			strLoan += "\nCuota mensual: " + df.format((Math.round(cuotaMensual*100.0)/10000.0));
			strLoan += "\nPago total del credito: " + (int)valorFuturo;
			strLoan += "\nTasa de interés: " + tasaInteres;
			
			return strLoan;
		} else {
			if(this.getNext() != null) {
				return this.getNext().process(number);
			} else {
				return "Buscando socio";
			}
		}
	}
	
	
}



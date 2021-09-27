package com.example.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Socios")

public class Socio {
	@Id
	@Column(name="idSocio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSocio;
	@Column(name="nombreSocio", nullable = false, length = 20)
	private String nombreSocio;
	@Column(name = "tasaInteresSocio", nullable = false)
	private double tasaInteresSocio;
	@Column(name = "montoMaximoSocio")
	private int montoMaximoSocio;
	public Long getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(Long idSocio) {
		this.idSocio = idSocio;
	}
	public String getNombreSocio() {
		return nombreSocio;
	}
	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}
	public double getTasaInteresSocio() {
		return tasaInteresSocio;
	}
	public void setTasaInteresSocio(double tasaInteresSocio) {
		this.tasaInteresSocio = tasaInteresSocio;
	}
	public int getMontoMaximoSocio() {
		return montoMaximoSocio;
	}
	public void setMontoMaximoSocio(int montoMaximoSocio) {
		this.montoMaximoSocio = montoMaximoSocio;
	}
	
	

}

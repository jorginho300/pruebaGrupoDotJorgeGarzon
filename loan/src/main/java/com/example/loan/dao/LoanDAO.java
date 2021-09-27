package com.example.loan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.entity.Socio;

public interface LoanDAO extends JpaRepository<Socio, Long>{

}

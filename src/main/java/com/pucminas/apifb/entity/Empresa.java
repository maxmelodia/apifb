package com.pucminas.apifb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TB_CADEMPRESA_EMP")
public class Empresa {
	
	@Id
	private Integer cod_emp;
	
	private String razao_emp;
	
	private String cpf_cgc_emp;

	public Integer getCod_emp() {
		return cod_emp;
	}

	public void setCod_emp(Integer cod_emp) {
		this.cod_emp = cod_emp;
	}

	public String getRazao_emp() {
		return razao_emp;
	}

	public void setRazao_emp(String razao_emp) {
		this.razao_emp = razao_emp;
	}

	public String getCpf_cgc_emp() {
		return cpf_cgc_emp;
	}

	public void setCpf_cgc_emp(String cpf_cgc_emp) {
		this.cpf_cgc_emp = cpf_cgc_emp;
	}
	
}

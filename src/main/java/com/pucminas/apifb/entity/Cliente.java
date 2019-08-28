package com.pucminas.apifb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String cpfcgc;
	
	private String endereco;
	
	private String numero;
	
	private String compl;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
	
	private String cep;
	
	private String inscmun;
	
	private String inscest;
	
	private String fone;
	
	private String nomefantasia;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfcgc() {
		return cpfcgc;
	}
	public void setCpfcgc(String cpfcgc) {
		this.cpfcgc = cpfcgc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCompl() {
		return compl;
	}
	public void setCompl(String compl) {
		this.compl = compl;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getInscmun() {
		return inscmun;
	}
	public void setInscmun(String inscmun) {
		this.inscmun = inscmun;
	}
	public String getInscest() {
		return inscest;
	}
	public void setInscest(String inscest) {
		this.inscest = inscest;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

}

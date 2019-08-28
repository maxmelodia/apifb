package com.pucminas.apifb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pucminas.apifb.entity.Empresa;
import com.pucminas.apifb.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository; 
	
	public List<Empresa> listarEmpresa(){
		return empresaRepository.findAll();
	}
	
	public Optional<Empresa> buscarEmpresaPorId(Integer id) {
		return empresaRepository.findById(id);
	}
}

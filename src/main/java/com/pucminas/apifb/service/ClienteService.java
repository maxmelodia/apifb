package com.pucminas.apifb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pucminas.apifb.entity.Cliente;
import com.pucminas.apifb.repository.ClienteRepository;
import com.pucminas.apifb.repository.filter.ClienteFilter;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	public Page<Cliente> pesquisar(ClienteFilter clienteFilter, Pageable pageable){
		return clienteRepository.pesquisar(clienteFilter,pageable);
	}
	
	public Cliente pesquisarPorId(Integer id){
		return clienteRepository.findById(id).orElse(null);
	}
	
}

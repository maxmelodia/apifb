package com.pucminas.apifb.repository.cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pucminas.apifb.entity.Cliente;
import com.pucminas.apifb.repository.filter.ClienteFilter;

public interface ClienteRepositoryQuery {
	
	public Page<Cliente> pesquisar(ClienteFilter clienteFilter, Pageable pageable);
		

}

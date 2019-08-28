package com.pucminas.apifb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucminas.apifb.entity.Cliente;
import com.pucminas.apifb.repository.cliente.ClienteRepositoryQuery;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery{

}

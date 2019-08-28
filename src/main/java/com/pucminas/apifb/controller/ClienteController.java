package com.pucminas.apifb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pucminas.apifb.entity.Cliente;
import com.pucminas.apifb.repository.filter.ClienteFilter;
import com.pucminas.apifb.service.ClienteService;
import com.pucminas.apifb.util.Util;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;

	@GetMapping("/json")
	public Page<Cliente> pesquisarJson(ClienteFilter clienteFilter, Pageable pageable){
		return clienteService.pesquisar(clienteFilter, pageable);
	}

	@GetMapping
	public ModelAndView pesquisar(ClienteFilter clienteFilter, @PageableDefault(page = 1, size = 10) Pageable pageable){
		Page<Cliente> clientes = clienteService.pesquisar(clienteFilter, pageable);
		ModelAndView mv = new ModelAndView("/cliente");
		mv.addObject("clientes", clientes);

		int totalPages = clientes.getTotalPages();
        if (totalPages > 0) {
        	List<Integer> pageNumbers = Util.getRangeClosed(clientes.getNumber());
            mv.addObject("pageNumbers", pageNumbers);
        }
		return mv; 
	}
	
	
/*	
	@GetMapping
	public ResponseEntity<List<Cliente>> pesquisar(){
		List<Cliente> clientes = clienteService.pesquisar();
		return ResponseEntity.ok().body(clientes); 
	}
*/	
	
	
/*	
	@GetMapping
	public ModelAndView pesquisar(){
		List<Cliente> clientes = clienteService.pesquisar();
		ModelAndView mv = new ModelAndView("/cliente");
		mv.addObject("clientes", clientes);
		return mv; 
	}
*/
	
}

package com.pucminas.apifb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pucminas.apifb.entity.Empresa;
import com.pucminas.apifb.service.EmpresaService;

@RestController
@RequestMapping("/")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping("/empresas")
	public ResponseEntity<List<Empresa>> getEmpresas() {
		List<Empresa> empresas = empresaService.listarEmpresa();
		return ResponseEntity.status(HttpStatus.OK).body(empresas);
	}
	
	@GetMapping("/empresas/{id}")
	public ResponseEntity<Optional<Empresa>> getEmpresa(@PathVariable Integer id) {
		Optional<Empresa> empresa = empresaService.buscarEmpresaPorId(id);
		return ResponseEntity.status(HttpStatus.OK).body(empresa);
	}
	
	@GetMapping("/")
	public ModelAndView findAll() {
		List<Empresa> empresas = empresaService.listarEmpresa();
		ModelAndView mv = new ModelAndView("/post");
		mv.addObject("posts", empresas);
		return mv;
	}	
	
}



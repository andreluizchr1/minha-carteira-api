package com.carteira.interfaces;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carteira.interfaces.input.EmpresaInput;
import com.carteira.interfaces.mapping.EmpresaMapper;
import com.carteira.interfaces.output.EmpresaOutput;
import com.carteira.services.EmpresaService;

import io.swagger.v3.oas.annotations.tags.Tag;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 13 de jun. de 2022
 */
@Service
@RestController
@RequestMapping(path = "/empresas", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Empresa API", description = "API que manipula os dados de uma empresa lista em bolsa")
public class EmpresaAPI {

	private static final int PAGE_SIZE = 10;
	
	@Autowired
	private EmpresaMapper mapper;
	
	@Autowired
	private EmpresaService service;
	
	@PostMapping
	public EmpresaOutput createEmpresa(@RequestBody @Valid EmpresaInput input) {
		return mapper.map(service.save(mapper.map(input)));
	}
	
	@GetMapping
	public List<EmpresaOutput> listEmpresas(@RequestParam(name = "page", defaultValue = "0") int page){
		return mapper.map(service.listEmpresas(page, PAGE_SIZE));
	}
	
}

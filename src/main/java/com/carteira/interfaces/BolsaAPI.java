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

import com.carteira.interfaces.input.BolsaInput;
import com.carteira.interfaces.mapping.BolsaMapper;
import com.carteira.interfaces.output.BolsaOutput;
import com.carteira.services.BolsaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 9 de jun. de 2022
 */

@Service
@RestController
@RequestMapping(path = "/bolsas", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Bolsa API", description = "API que manipula os dados de uma Bolsa de Valores")
public class BolsaAPI {

	private static final int PAGE_SIZE = 10;

	@Autowired
	private BolsaMapper mapper;

	@Autowired
	private BolsaService service;


	@GetMapping
	@Operation(description = "Lista todas as bolsas")
	public List<BolsaOutput> listBolsas(@RequestParam(name = "page", defaultValue = "0") int page) {
		return mapper.map(service.listBolsas(page, PAGE_SIZE));
	}

	@PostMapping
	public BolsaOutput createBolsa(@RequestBody @Valid BolsaInput input) {
		return mapper.map(service.save(mapper.map(input)));
	}

}

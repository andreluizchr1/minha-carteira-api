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

import com.carteira.interfaces.input.NegocioInput;
import com.carteira.interfaces.mapping.NegocioMapper;
import com.carteira.interfaces.output.NegocioOutput;
import com.carteira.services.NegocioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 3 de jul. de 2022
 */
@Service
@RestController
@RequestMapping(path = "/negocios", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Negócio API", description = "API que manipula os dados de uma negociação de um título")
public class NegocioAPI {

	private static final int PAGE_SIZE = 10;

	@Autowired
	private NegocioMapper mapper;

	@Autowired
	private NegocioService service;

	@PostMapping
	@Operation(description = "Cria uma negociação de um titulo", responses = {
			@ApiResponse(responseCode = "200", description = "Caso o cadastro do negócio tenha sucesso") })
	public NegocioOutput createNegocio(@RequestBody @Valid NegocioInput input) {
		return mapper.map(service.save(mapper.map(input)));
	}

	@GetMapping
	public List<NegocioOutput> listNegocios(@RequestParam(name = "page", defaultValue = "0") int page) {
		return mapper.map(service.listNegocios(page, PAGE_SIZE));
	}
}

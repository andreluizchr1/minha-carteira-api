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

import com.carteira.interfaces.input.TituloInput;
import com.carteira.interfaces.mapping.TituloMapper;
import com.carteira.interfaces.output.TituloOutput;
import com.carteira.services.TituloService;

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
 * Data de Criação do Arquivo: 22 de jun. de 2022
 */
@Service
@RestController
@RequestMapping(path = "/titulos", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Titulo API", description = "API que manipula os dados de um titulo de valor")
public class TituloAPI {

	private static final int PAGE_SIZE = 10;

	@Autowired
	private TituloMapper mapper;

	@Autowired
	private TituloService service;

	@PostMapping
	@Operation(description = "Cria um titulo de valor negociável", responses = {
			@ApiResponse(responseCode = "200", description = "Caso o cadastro do título tenha sucesso")
	})
	public TituloOutput createTitulo(@RequestBody @Valid TituloInput input) {
		return mapper.map(service.save(mapper.map(input)));
	}

	@GetMapping
	public List<TituloOutput> listTitulos(@RequestParam(name = "page", defaultValue = "0") int page) {
		return mapper.map(service.listTitulos(page, PAGE_SIZE));
	}
}

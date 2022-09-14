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

import com.carteira.interfaces.input.NotaCorretagemInput;
import com.carteira.interfaces.mapping.NotaCorretagemMapper;
import com.carteira.interfaces.output.NotaCorretagemOutput;
import com.carteira.services.NotaCorretagemService;

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
 * Data de Criação do Arquivo: 4 de jul. de 2022
 */
@Service
@RestController
@RequestMapping(path = "/notas", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Nota de Corretagem API", description = "API que manipula os dados de uma nota de corretagem")
public class NotaCorretagemAPI {

	private static final int PAGE_SIZE = 10;

	@Autowired
	private NotaCorretagemMapper mapper;

	@Autowired
	private NotaCorretagemService service;

	@PostMapping
	@Operation(description = "Cria uma nota de corretagem", responses = {
			@ApiResponse(responseCode = "200", description = "Caso a nota de corretagem seja cadastrada com sucesso") })
	public NotaCorretagemOutput createNotaCorretagem(@RequestBody @Valid NotaCorretagemInput input) {
		return mapper.map(service.save(mapper.map(input)));
	}

	@GetMapping
	public List<NotaCorretagemOutput> listNotaCorretagem(@RequestParam(name = "page", defaultValue = "0") int page) {
		return mapper.map(service.listNotasCorretagem(page, PAGE_SIZE));
	}
}

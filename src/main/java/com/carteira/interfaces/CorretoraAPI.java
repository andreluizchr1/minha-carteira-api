package com.carteira.interfaces;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.carteira.domain.Corretora;
import com.carteira.interfaces.input.CorretoraInput;
import com.carteira.interfaces.mapping.CorretoraMapper;
import com.carteira.interfaces.output.CorretoraOutput;
import com.carteira.services.CorretoraService;

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
@RequestMapping(path = "/corretoras", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Corretora API", description = "API que manipula os dados das Corretoras.")
public class CorretoraAPI {

	private static final int PAGE_SIZE = 10;

	@Autowired
	private CorretoraMapper mapper;

	@Autowired
	private CorretoraService service;

	@GetMapping
	@RolesAllowed("ROLE_INVESTIDOR")
	@Operation(description = "Lista todas as corretoras")
	public List<CorretoraOutput> listCorretoras(@RequestParam(name = "page", defaultValue = "0") int page) {
		return mapper.map(service.listCorretoras(page, PAGE_SIZE));
	}

	@GetMapping("/situacao")
	public List<CorretoraOutput> listCorretorasByStatus(
			@RequestParam(value = "status", required = true) boolean status) {
		return mapper.map(service.findByStatus(status));
	}

	@GetMapping("/{id}")
	public CorretoraOutput findCorretora(@PathVariable("id") Long id) {
		return mapper.map(service.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
	}

	@PostMapping
	public CorretoraOutput createCorretora(@RequestBody @Valid CorretoraInput corretoraInput) {
		return mapper.map(service.save(mapper.map(corretoraInput)));
	}

	@PutMapping("/{id}")
	public CorretoraOutput fullUpdateCorretora(@PathVariable("id") Long id, @RequestBody Corretora corretora) {
		return mapper.map(service.fullUpdateCorretora(id, corretora));
	}

	@PatchMapping("/{id}")
	public CorretoraOutput incremetalUpdateCorretora(@PathVariable("id") Long id, @RequestBody Corretora corretora) {
		return mapper.map(service.incremetalUpdateCorretora(id, corretora));
	}
}

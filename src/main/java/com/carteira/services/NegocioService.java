package com.carteira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.carteira.domain.Negocio;
import com.carteira.repository.NegocioRepository;

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
public class NegocioService {
	
	@Autowired
	private NegocioRepository repository;
	
	/**
	 * 
	 * @param negocio
	 * @return
	 */
	public Negocio save(Negocio negocio) {
		return repository.save(negocio);
	}
	
	/**
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Negocio> listNegocios(int page, int size){
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Negocio findById(Long id) {
		return repository.findById(id).get();
	}
}

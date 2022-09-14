package com.carteira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.carteira.domain.NotaCorretagem;
import com.carteira.repository.NotaCorretagemRepository;
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
public class NotaCorretagemService {
	
	@Autowired
	private NotaCorretagemRepository repository;
	
	/**
	 * 
	 * @param nota
	 * @return
	 */
	public NotaCorretagem save(NotaCorretagem nota) {
		return repository.save(nota);
	}
	
	/**
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<NotaCorretagem> listNotasCorretagem(int page, int size){
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public NotaCorretagem findById(Long id) {
		return repository.findById(id).get();
	}
}

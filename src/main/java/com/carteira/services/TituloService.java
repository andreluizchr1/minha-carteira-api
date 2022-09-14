package com.carteira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 15 de jun. de 2022
 */

import com.carteira.domain.Titulo;
import com.carteira.repository.BolsaRepository;
import com.carteira.repository.EmpresaRepository;
import com.carteira.repository.TituloRepository;
@Service
public class TituloService {

	@Autowired
	private TituloRepository repository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private BolsaRepository bolsaRepository;
	
	/**
	 * 
	 * @param titulo
	 * @return
	 */
	public Titulo save(Titulo titulo) {
		titulo.setEmpresa(empresaRepository.findById(titulo.getEmpresa().getId()).get());
		titulo.setBolsa(bolsaRepository.findById(titulo.getBolsa().getId()).get());
		return repository.save(titulo);
	}
	
	/**
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Titulo> listTitulos(int page, int size){
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}
}

package com.carteira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.carteira.domain.Bolsa;
import com.carteira.repository.BolsaRepository;

/**
 * 
 * @author andre
 *
 * @Date   9 de jun. de 2022
 */

@Service
public class BolsaService {

	@Autowired
	private BolsaRepository repository;

	/**
	 * 
	 * @param bolsa
	 * @return
	 */
	public Bolsa save(Bolsa bolsa) {
		return repository.save(bolsa);
	}

	/**
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Bolsa> listBolsas(int page, int size) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Bolsa findById(Long id) {
		return repository.findById(id).get();
	}
}

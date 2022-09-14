package com.carteira.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.carteira.domain.Corretora;
import com.carteira.repository.CorretoraRepository;

/**
 * 
 * @author andre
 *
 * @Date   9 de jun. de 2022
 */
@Service
public class CorretoraService {

	@Autowired
	private CorretoraRepository repository;

	/**
	 * 
	 * @param corretora
	 * @return
	 */
	public Corretora save(Corretora corretora) {
		return repository.save(corretora);
	}

	/**
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Corretora> listCorretoras(int page, int size) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Corretora> findById(Long id) {
		return repository.findById(id);
	}

	/**
	 * 
	 * @param status
	 * @return
	 */
	public List<Corretora> findByStatus(boolean status) {
		return repository.findByStatus(status);
	}

	/**
	 * 
	 * @param id
	 * @param corretora
	 * @return
	 */
	public Corretora fullUpdateCorretora(Long id, Corretora corretora) {
		Corretora foundCorretora = findById(id).get();
		foundCorretora.setNome(corretora.getNome());
		foundCorretora.setCnpj(corretora.getCnpj());
		foundCorretora.setDataCadastro(corretora.getDataCadastro());
		foundCorretora.setStatus(corretora.getStatus());
		return save(foundCorretora);
	}

	/**
	 * 
	 * @param id
	 * @param corretora
	 * @return
	 */
	public Corretora incremetalUpdateCorretora(Long id, Corretora corretora) {
		Corretora foundCorretora = findById(id).get();
		foundCorretora.setNome(Optional.ofNullable(corretora.getNome()).orElse(foundCorretora.getNome()));
		foundCorretora.setCnpj(Optional.ofNullable(corretora.getCnpj()).orElse(foundCorretora.getCnpj()));
		foundCorretora.setDataCadastro(
				Optional.ofNullable(corretora.getDataCadastro()).orElse(foundCorretora.getDataCadastro()));
		foundCorretora.setStatus(Optional.ofNullable(corretora.getStatus()).orElse(foundCorretora.getStatus()));
		return save(foundCorretora);
	}
}

package com.carteira.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
/**
 * 
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 10 de jun. de 2022
 */

import com.carteira.domain.Empresa;
import com.carteira.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	/**
	 * 
	 * @param empresa
	 * @return
	 */
	public Empresa save(Empresa empresa) {
		return repository.save(empresa);
	}

	/**
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<Empresa> listEmpresas(int page, int size) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Empresa findById(Long id) {
		return repository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param empresa
	 * @return
	 */
	public Empresa fullUpdateEmpresa(Long id, Empresa empresa) {
		Empresa foundEmpresa = findById(id);
		foundEmpresa.setNome(empresa.getNome());
		foundEmpresa.setCnpj(empresa.getCnpj());
		foundEmpresa.setAtivo(empresa.isAtivo());
		foundEmpresa.setDataCriacao(empresa.getDataCriacao());
		foundEmpresa.setDataFinalizacao(empresa.getDataFinalizacao());
		return save(foundEmpresa);
	}

	/**
	 * 
	 * @param id
	 * @param empresa
	 * @return
	 */
	public Empresa incrementalUpdateEmpresa(Long id, Empresa empresa) {
		Empresa foundEmpresa = findById(id);
		foundEmpresa.setNome(Optional.ofNullable(empresa.getNome()).orElse(foundEmpresa.getNome()));
		foundEmpresa.setCnpj(Optional.ofNullable(empresa.getCnpj()).orElse(foundEmpresa.getCnpj()));
		foundEmpresa.setAtivo(Optional.ofNullable(empresa.isAtivo()).orElse(foundEmpresa.isAtivo()));
		foundEmpresa
				.setDataCriacao(Optional.ofNullable(empresa.getDataCriacao()).orElse(foundEmpresa.getDataCriacao()));
		foundEmpresa.setDataFinalizacao(
				Optional.ofNullable(empresa.getDataFinalizacao()).orElse(foundEmpresa.getDataFinalizacao()));
		return save(foundEmpresa);
	}
}

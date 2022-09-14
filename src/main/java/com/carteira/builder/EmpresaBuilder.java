package com.carteira.builder;

import java.util.Date;

import com.carteira.domain.Empresa;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor: André Luiz Chaves Rodrigues Contato: andreluizchr1@gmail.com Data de
 * Criação do Arquivo: 10 de jun. de 2022
 */
public class EmpresaBuilder {

	private Empresa empresa;

	public EmpresaBuilder() {
		this.empresa = new Empresa();
	}

	public static EmpresaBuilder builder() {
		return new EmpresaBuilder();
	}

	public EmpresaBuilder addNome(String nome) {
		this.empresa.setNome(nome);
		return this;
	}

	public EmpresaBuilder addCNPJ(String cnpj) {
		this.empresa.setCnpj(cnpj);
		return this;
	}

	public EmpresaBuilder setStatus(boolean status) {
		this.empresa.setAtivo(status);
		return this;
	}

	public EmpresaBuilder addDataCriacao(Date dataCriacao) {
		this.empresa.setDataCriacao(dataCriacao);
		return this;
	}

	public EmpresaBuilder addDataFinalizacao(Date dataFinalizacao) {
		this.empresa.setDataFinalizacao(dataFinalizacao);
		return this;
	}

	public Empresa get() {
		return this.empresa;
	}
}

package com.carteira.builder;

import java.util.Date;

import com.carteira.domain.Bolsa;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 10 de jun. de 2022
 */
public class BolsaBuilder {

	private Bolsa bolsa;

	public BolsaBuilder() {
		this.bolsa = new Bolsa();
	}

	public static BolsaBuilder builder() {
		return new BolsaBuilder();
	}

	public BolsaBuilder addNome(String nome) {
		this.bolsa.setNome(nome);
		return this;
	}

	public BolsaBuilder addSigla(String sigla) {
		this.bolsa.setSigla(sigla);
		return this;
	}

	public BolsaBuilder setAtivo(boolean ativo) {
		this.bolsa.setAtivo(ativo);
		return this;
	}

	public BolsaBuilder addDataCadastro(Date dataCadastro) {
		this.bolsa.setDataCriacao(dataCadastro);
		return this;
	}
	
	public BolsaBuilder addDataFinalizacao(Date dataFinalizacao) {
		this.bolsa.setDataFinalizacao(dataFinalizacao);
		return this;
	}

	public Bolsa get() {
		return this.bolsa;
	}

}

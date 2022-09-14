package com.carteira.builder;

import java.util.Date;

import com.carteira.interfaces.output.BolsaOutput;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 10 de jun. de 2022
 */
public class BolsaOutputBuilder {

	private BolsaOutput bolsaOutput;

	public BolsaOutputBuilder() {
		this.bolsaOutput = new BolsaOutput();
	}

	public static BolsaOutputBuilder builder() {
		return new BolsaOutputBuilder();
	}

	public BolsaOutputBuilder addId(Long id) {
		this.bolsaOutput.setId(id);
		return this;
	}

	public BolsaOutputBuilder addNome(String nome) {
		this.bolsaOutput.setNome(nome);
		return this;
	}

	public BolsaOutputBuilder addSigla(String sigla) {
		this.bolsaOutput.setSigla(sigla);
		return this;
	}

	public BolsaOutputBuilder setAtivo(boolean ativo) {
		this.bolsaOutput.setAtivo(ativo);
		return this;
	}

	public BolsaOutputBuilder addDataCadastro(Date dataCadastro) {
		this.bolsaOutput.setDataCriacao(dataCadastro);
		return this;
	}
	
	public BolsaOutputBuilder addDataFinalizacao(Date dataFinalizacao) {
		this.bolsaOutput.setDataFinalizacao(dataFinalizacao);
		return this;
	}

	public BolsaOutput get() {
		return this.bolsaOutput;
	}
}

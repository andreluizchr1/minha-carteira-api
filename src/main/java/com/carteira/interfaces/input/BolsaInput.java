package com.carteira.interfaces.input;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 10 de jun. de 2022
 */
public class BolsaInput {

	@NotEmpty(message = "É necessário um nome para a bolsa")
	private String nome;

	@NotEmpty(message = "É necessário uma sigla para a bolsa")
	private String sigla;
	
	@NotNull(message = "É necessário informar se a bolsa está ativa no sistema")
	private boolean ativo;
	
	private Date dataCriacao;
	
	private Date dataFinalizacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}

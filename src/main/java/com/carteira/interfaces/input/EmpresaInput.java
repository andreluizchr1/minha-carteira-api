package com.carteira.interfaces.input;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor: André Luiz Chaves Rodrigues Contato: andreluizchr1@gmail.com Data de
 * Criação do Arquivo: 10 de jun. de 2022
 */
public class EmpresaInput {

	@NotEmpty(message = "É obrigatório o nome da empresa")
	private String nome;

	@NotEmpty(message = "É obrigatório o cnpj da empresa")
	private String cnpj;

	private Date dataCriacao;

	@NotNull(message = "É necessário informar se a empresa está ativa no sistema")
	private boolean ativo;

	private Date dataFinalizacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}

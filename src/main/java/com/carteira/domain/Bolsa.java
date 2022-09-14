package com.carteira.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor: André Luiz Chaves Rodrigues Contato: andreluizchr1@gmail.com Data de
 * Criação do Arquivo: 9 de jun. de 2022
 */

@Entity
@Schema(description = "Classe que representa a bolsa onde está sendo negociado")
public class Bolsa {

	@Id
	@SequenceGenerator(sequenceName = "bolsa_seq", name = "bolsa_gen", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bolsa_gen")
	private Long id;

	@NotEmpty(message = "É necessário um nome para a bolsa")
	private String nome;

	@NotEmpty(message = "É necessário uma sigla para a bolsa")
	private String sigla;

	@NotNull
	private boolean ativo;

	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dataCriacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataFinalizacao;
	
	public Bolsa() {
		// TODO Auto-generated constructor stub
	}

	public Bolsa(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

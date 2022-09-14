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
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 09 de jun. de 2022
 */
@Entity
@Schema(description = "Classe que representa uma corretora de valores")
public class Corretora {

	@Id
	@SequenceGenerator(sequenceName = "corretora_seq", name = "corretora_gen", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "corretora_gen")
	private Long id;

	@NotEmpty(message = "O nome não pode estar em branco")
	private String nome;

	@NotNull(message = "A data de cadastro não pode ser nulo")
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Temporal(TemporalType.DATE)
	private Date dataFinalizacao;

	@NotNull(message = "É necessário informar o cnpj da corretora")
	private String cnpj;

	@NotNull(message = "O status não pode ser nulo")
	private boolean status;

	public Corretora() {
		// TODO Auto-generated constructor stub
	}
	
	public Corretora(Long id) {
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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

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

@Entity
@Schema(description = "Classe que representa uma empresa listada em bolsa")
public class Empresa {

	@Id
	@SequenceGenerator(sequenceName = "empresa_seq", name = "empresa_gen", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa_gen")
	private Long id;

	@NotEmpty(message = "É obrigatório o nome da empresa")
	private String nome;

	@NotEmpty(message = "É obrigatório o cnpj da empresa")
	private String cnpj;

	@NotNull
	private boolean ativo;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;

	private Date dataFinalizacao;
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public Empresa(Long id) {
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

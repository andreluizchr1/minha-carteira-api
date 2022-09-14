package com.carteira.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 3 de jul. de 2022
 */
@Entity
@Schema(description = "Classe que representa um titulo de valor negociavel")
public class Titulo {

	@Id
	@SequenceGenerator(sequenceName = "titulo_seq", name = "titulo_gen", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "titulo_gen")
	private Long id;

	@OneToOne
	private Bolsa bolsa;

	@ManyToOne
	private Empresa empresa;

	@NotEmpty(message = "É obrigatório infomar o codigo do titulo")
	private String codigo;

	@JsonFormat(pattern = "dd-MM-yyyy", locale = "pt_BR", timezone = "EST")
	@Temporal(TemporalType.DATE)
	private Date dataInicialNegociacao;

	@Temporal(TemporalType.DATE)
	private Date dataFinalNegociacao;

	private BigDecimal strike = BigDecimal.ZERO;
	
	private boolean ativo;

	private boolean acao;
	
	private boolean opcao;
	
	public Titulo() {
		// TODO Auto-generated constructor stub
	}

	public Titulo(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataInicialNegociacao() {
		return dataInicialNegociacao;
	}

	public void setDataInicialNegociacao(Date dataInicialNegociacao) {
		this.dataInicialNegociacao = dataInicialNegociacao;
	}

	public Date getDataFinalNegociacao() {
		return dataFinalNegociacao;
	}

	public void setDataFinalNegociacao(Date dataFinalNegociacao) {
		this.dataFinalNegociacao = dataFinalNegociacao;
	}

	public BigDecimal getStrike() {
		return strike;
	}

	public void setStrike(BigDecimal strike) {
		this.strike = strike;
	}

	public boolean isAcao() {
		return acao;
	}

	public void setAcao(boolean acao) {
		this.acao = acao;
	}

	public boolean isOpcao() {
		return opcao;
	}

	public void setOpcao(boolean opcao) {
		this.opcao = opcao;
	}

}

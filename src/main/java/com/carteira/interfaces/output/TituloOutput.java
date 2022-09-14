package com.carteira.interfaces.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 22 de jun. de 2022
 */
public class TituloOutput {

	private Long id;

	private BolsaOutput bolsa;

	private boolean ativo;

	private EmpresaOutput empresa;

	private String codigo;

	private Date dataInicialNegociacao;

	private Date dataFinalNegociacao;

	private BigDecimal strike = BigDecimal.ZERO;
	
	private boolean acao;
	
	private boolean opcao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BolsaOutput getBolsa() {
		return bolsa;
	}

	public void setBolsa(BolsaOutput bolsa) {
		this.bolsa = bolsa;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public EmpresaOutput getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaOutput empresa) {
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

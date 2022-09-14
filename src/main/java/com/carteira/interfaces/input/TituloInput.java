package com.carteira.interfaces.input;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 15 de jun. de 2022
 */
public class TituloInput {

	@NotNull
	private Long idBolsa;

	@NotNull
	private boolean ativo;

	@NotNull
	private Long idEmpresa;

	@NotEmpty(message = "É obrigatório infomar o codigo do titulo")
	private String codigo;

	@JsonFormat(pattern = "dd-MM-yyyy", locale = "pt_BR", timezone = "EST")
	@NotNull(message = "É obrigatório informar uma data inicial de negociação")
	@Temporal(TemporalType.DATE)
	private Date dataInicialNegociacao;

	@Temporal(TemporalType.DATE)
	private Date dataFinalNegociacao;

	private BigDecimal strike = BigDecimal.ZERO;
	
	@NotNull
	private boolean acao;
	
	@NotNull
	private boolean opcao;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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

	public Long getIdBolsa() {
		return idBolsa;
	}

	public void setIdBolsa(Long idBolsa) {
		this.idBolsa = idBolsa;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
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

package com.carteira.builder;

import java.math.BigDecimal;
import java.util.Date;

import com.carteira.interfaces.output.BolsaOutput;
import com.carteira.interfaces.output.EmpresaOutput;
import com.carteira.interfaces.output.TituloOutput;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 22 de jun. de 2022
 */
public class TituloOutputBuilder {

	private TituloOutput output;
	
	public TituloOutputBuilder() {
		this.output = new TituloOutput();
	}
	
	public static TituloOutputBuilder builder() {
		return new TituloOutputBuilder();
	}
	
	public TituloOutputBuilder addId(Long id) {
		this.output.setId(id);
		return this;
	}
	
	public TituloOutputBuilder addBolsa(BolsaOutput bolsa) {
		this.output.setBolsa(bolsa);
		return this;
	}

	public TituloOutputBuilder setAtivo(boolean ativo) {
		this.output.setAtivo(ativo);
		return this;
	}

	public TituloOutputBuilder addCodigo(String codigo) {
		this.output.setCodigo(codigo);
		return this;
	}

	public TituloOutputBuilder addDataInicialNegociacao(Date dataInicialNegociacao) {
		this.output.setDataInicialNegociacao(dataInicialNegociacao);
		return this;
	}

	public TituloOutputBuilder addDataFinalNegociacao(Date dataFinalNegociacao) {
		this.output.setDataFinalNegociacao(dataFinalNegociacao);
		return this;
	}

	public TituloOutputBuilder addStrike(BigDecimal strike) {
		this.output.setStrike(strike);
		return this;
	}
	
	public TituloOutputBuilder setAcao(boolean acao) {
		this.output.setAcao(acao);
		return this;
	}
	
	public TituloOutputBuilder addEmpresa(EmpresaOutput empresa) {
		this.output.setEmpresa(empresa);
		return this;
	}
	
	public TituloOutputBuilder setOpcao(boolean opcao) {
		this.output.setOpcao(opcao);
		return this;
	}
	
	public TituloOutput get() {
		return this.output;
	}
}

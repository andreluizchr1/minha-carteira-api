package com.carteira.builder;

import java.math.BigDecimal;
import java.util.Date;

import com.carteira.domain.Bolsa;
import com.carteira.domain.Empresa;
import com.carteira.domain.Titulo;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 22 de jun. de 2022
 */
public class TituloBuilder {

	private Titulo titulo;

	public TituloBuilder() {
		this.titulo = new Titulo();
	}

	public static TituloBuilder builder() {
		return new TituloBuilder();
	}

	public TituloBuilder addBolsa(Long idBolsa) {
		this.titulo.setBolsa(new Bolsa(idBolsa));
		return this;
	}
	
	public TituloBuilder addEmpresa(Long idEmpresa) {
		this.titulo.setEmpresa(new Empresa(idEmpresa));
		return this;
	}

	public TituloBuilder setAtivo(boolean ativo) {
		this.titulo.setAtivo(ativo);
		return this;
	}

	public TituloBuilder addCodigo(String codigo) {
		this.titulo.setCodigo(codigo);
		return this;
	}

	public TituloBuilder addDataInicialNegociacao(Date dataInicialNegociacao) {
		this.titulo.setDataInicialNegociacao(dataInicialNegociacao);
		return this;
	}

	public TituloBuilder addDataFinalNegociacao(Date dataFinalNegociacao) {
		this.titulo.setDataFinalNegociacao(dataFinalNegociacao);
		return this;
	}

	public TituloBuilder addStrike(BigDecimal strike) {
		this.titulo.setStrike(strike);
		return this;
	}
	
	public TituloBuilder setAcao(boolean acao) {
		this.titulo.setAcao(acao);
		return this;
	}
	
	public TituloBuilder setOpcao(boolean opcao) {
		this.titulo.setOpcao(opcao);
		return this;
	}
	
	public Titulo get() {
		return this.titulo;
	}
}

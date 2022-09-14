package com.carteira.builder;

import java.math.BigDecimal;

import com.carteira.domain.TipoMercado;
import com.carteira.domain.TipoNegocio;
import com.carteira.domain.Titulo;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 3 de jul. de 2022
 */

import com.carteira.interfaces.output.NegocioOutput;

public class NegocioOutputBuilder {

	private NegocioOutput negocioOutput;

	public NegocioOutputBuilder() {
		this.negocioOutput = new NegocioOutput();
	}
	
	public static NegocioOutputBuilder builder() {
		return new NegocioOutputBuilder();
	}
	
	public NegocioOutputBuilder addId(Long id) {
		this.negocioOutput.setId(id);
		return this;
	}
	
	public NegocioOutputBuilder addTitulo(Titulo titulo) {
		this.negocioOutput.setTitulo(titulo);
		return this;
	}
	
	public NegocioOutputBuilder addQuantidade(int quantidade) {
		this.negocioOutput.setQuantidade(quantidade);
		return this;
	}
	
	public NegocioOutputBuilder addPreco(BigDecimal preco) {
		this.negocioOutput.setPreco(preco);
		return this;
	}
	
	public NegocioOutputBuilder addTipoNegocio(TipoNegocio tipoNegocio) {
		this.negocioOutput.setTipoNegocio(tipoNegocio);
		return this;
	}
	
	public NegocioOutputBuilder addTipoMercado(TipoMercado tipoMercado) {
		this.negocioOutput.setTipoMercado(tipoMercado);
		return this;
	}
	
	public NegocioOutput get() {
		return this.negocioOutput;
	}

}

package com.carteira.builder;

import java.math.BigDecimal;

import com.carteira.domain.Negocio;
import com.carteira.domain.NotaCorretagem;
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
public class NegocioBuilder {

	private Negocio negocio;
	
	public NegocioBuilder() {
		this.negocio = new Negocio();
	}
	
	public static NegocioBuilder builder() {
		return new NegocioBuilder();
	}
	
	public NegocioBuilder addIdTitulo(Long id) {
		this.negocio.setTitulo(new Titulo(id));
		return this;
	}
	
	public NegocioBuilder addQuantidade(int quantidade) {
		this.negocio.setQuantidade(quantidade);
		return this;
	}
	
	public NegocioBuilder addPreco(BigDecimal preco) {
		this.negocio.setPreco(preco);
		return this;
	}
	
	public NegocioBuilder addTipoNegocio(TipoNegocio tipoNegocio) {
		this.negocio.setTipoNegocio(tipoNegocio);
		return this;
	}
	
	public NegocioBuilder addTipoMercado(TipoMercado tipoMercado) {
		this.negocio.setTipoMercado(tipoMercado);
		return this;
	}
	
	public NegocioBuilder addNotaCorretagem(NotaCorretagem notaCorretagem) {
		this.negocio.setNotaCorretagem(notaCorretagem);
		return this;
	}
	
	public Negocio get() {
		return this.negocio;
	}
}

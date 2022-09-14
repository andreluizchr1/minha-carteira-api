package com.carteira.interfaces.output;

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
 * Data de Criação do Arquivo: 6 de jul. de 2022
 */
public class NegocioOutput {

	private Long id;
	
	private Titulo titulo;
	
	private Integer quantidade;
	
	private BigDecimal preco;
	
	private BigDecimal valorNegociado;
	
	private TipoNegocio tipoNegocio;
	
	private TipoMercado tipoMercado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}

	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}

	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public TipoMercado getTipoMercado() {
		return tipoMercado;
	}

	public void setTipoMercado(TipoMercado tipoMercado) {
		this.tipoMercado = tipoMercado;
	}
}

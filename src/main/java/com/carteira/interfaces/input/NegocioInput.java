package com.carteira.interfaces.input;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.carteira.domain.NotaCorretagem;
import com.carteira.domain.TipoMercado;
import com.carteira.domain.TipoNegocio;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 3 de jul. de 2022
 */
public class NegocioInput {
	
	@NotNull
	private Long idTitulo;
	
	@Min(value = 1)
	private Integer quantidade;
	
	private BigDecimal preco = BigDecimal.ZERO;
	
	@NotNull
	private TipoNegocio tipoNegocio;
	
	@NotNull
	private TipoMercado tipoMercado;
	
	private NotaCorretagem notaCorretagem;

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

	public Long getIdTitulo() {
		return idTitulo;
	}

	public void setIdTitulo(Long idTitulo) {
		this.idTitulo = idTitulo;
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

	public NotaCorretagem getNotaCorretagem() {
		return notaCorretagem;
	}

	public void setNotaCorretagem(NotaCorretagem notaCorretagem) {
		this.notaCorretagem = notaCorretagem;
	}
	
}

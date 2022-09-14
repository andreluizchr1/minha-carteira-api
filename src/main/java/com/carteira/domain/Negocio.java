package com.carteira.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 6 de jul. de 2022
 */
@Entity
@Schema(description = "Classe que representa uma negociação em uma nota de corretagem")
public class Negocio {

	@Id
	@SequenceGenerator(sequenceName = "negocio_seq", name = "negocio_gen", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "negocio_gen")
	private Long id;

	@OneToOne
	private Titulo titulo;
	
	@Min(value = 1)
	private Integer quantidade;
	
	private BigDecimal preco = BigDecimal.ZERO;
	
	@ManyToOne
	@JoinColumn(name = "id_nota_corretagem", nullable = false)
	private NotaCorretagem notaCorretagem;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoNegocio tipoNegocio;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoMercado tipoMercado;
	
	@Transient
	private BigDecimal valorNegociado = BigDecimal.ZERO;

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
		return getPreco().multiply(new BigDecimal(getQuantidade()));
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

	public NotaCorretagem getNotaCorretagem() {
		return notaCorretagem;
	}

	public void setNotaCorretagem(NotaCorretagem notaCorretagem) {
		this.notaCorretagem = notaCorretagem;
	}
	
}

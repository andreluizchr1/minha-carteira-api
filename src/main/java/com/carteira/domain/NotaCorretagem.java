package com.carteira.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Entity(name = "nota_corretagem")
@Schema(description = "Classe que representa uma nota de corretagem")
public class NotaCorretagem {

	@Id
	@SequenceGenerator(sequenceName = "nota_corretagem_seq", name = "nota_corretagem_gen", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nota_corretagem_gen")
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@NotNull(message = "É obrigatorio atribuir uma corretora")
	private Corretora corretora;
	
	@JsonBackReference
	@OneToMany(mappedBy = "notaCorretagem", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Negocio> negocios;

	private BigDecimal taxasImpostos = BigDecimal.ZERO;

	private BigDecimal irrf = BigDecimal.ZERO;
	
	public NotaCorretagem() {
		// TODO Auto-generated constructor stub
	}

	public NotaCorretagem(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Corretora getCorretora() {
		return corretora;
	}

	public void setCorretora(Corretora corretora) {
		this.corretora = corretora;
	}

	public BigDecimal getTaxasImpostos() {
		return taxasImpostos;
	}

	public void setTaxasImpostos(BigDecimal taxasImpostos) {
		this.taxasImpostos = taxasImpostos;
	}

	public BigDecimal getIrrf() {
		return irrf;
	}

	public void setIrrf(BigDecimal irrf) {
		this.irrf = irrf;
	}

	public List<Negocio> getNegocios() {
		return negocios;
	}

	public void setNegocios(List<Negocio> negocios) {
		this.negocios = negocios;
	}

}

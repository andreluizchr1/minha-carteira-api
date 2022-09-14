package com.carteira.interfaces.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 3 de jul. de 2022
 */
public class NotaCorretagemInput {

	@NotNull
	private Long idCorretora;
	
	private BigDecimal taxasImpostos;

	private BigDecimal irrf;
	
	@NotNull
	private List<NegocioInput> negocios;

	public Long getIdCorretora() {
		return idCorretora;
	}

	public void setIdCorretora(Long idCorretora) {
		this.idCorretora = idCorretora;
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

	public List<NegocioInput> getNegocios() {
		return negocios;
	}

	public void setNegocios(List<NegocioInput> negocios) {
		this.negocios = negocios;
	}
}

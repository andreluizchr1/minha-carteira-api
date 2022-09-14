package com.carteira.interfaces.output;

import java.math.BigDecimal;
import java.util.List;

import com.carteira.domain.Corretora;
import com.carteira.domain.Negocio;

public class NotaCorretagemOutput {

	private Long id;
	
	private Corretora corretora;
	
	private BigDecimal taxasImpostos;

	private BigDecimal irrf;
	
	private List<Negocio> negocios;

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

package com.carteira.builder;

import java.math.BigDecimal;
import java.util.List;

import com.carteira.domain.Corretora;
import com.carteira.domain.Negocio;
import com.carteira.interfaces.output.NotaCorretagemOutput;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 4 de jul. de 2022
 */
public class NotaCorretagemOutputBuilder {

	private NotaCorretagemOutput notaCorretagemOutput;
	
	public NotaCorretagemOutputBuilder() {
		this.notaCorretagemOutput = new NotaCorretagemOutput();
	}
	
	public static NotaCorretagemOutputBuilder builder() {
		return new NotaCorretagemOutputBuilder();
	}
	
	public NotaCorretagemOutputBuilder addCorretora(Corretora corretora) {
		this.notaCorretagemOutput.setCorretora(corretora);
		return this;
	}
	
	public NotaCorretagemOutputBuilder addNegocios(List<Negocio> negocios) {
		this.notaCorretagemOutput.setNegocios(negocios);
		return this;
	}
	
	public NotaCorretagemOutputBuilder addTaxasImpostos(BigDecimal taxasImpostos) {
		this.notaCorretagemOutput.setTaxasImpostos(taxasImpostos);
		return this;
	}
	
	public NotaCorretagemOutputBuilder addIrrf(BigDecimal irrf) {
		this.notaCorretagemOutput.setIrrf(irrf);
		return this;
	}
	
	public NotaCorretagemOutput get() {
		return this.notaCorretagemOutput;
	}
}

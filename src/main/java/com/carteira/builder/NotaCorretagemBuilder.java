package com.carteira.builder;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.carteira.domain.Corretora;
import com.carteira.domain.NotaCorretagem;
import com.carteira.interfaces.input.NegocioInput;
import com.carteira.interfaces.mapping.NegocioMapper;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 4 de jul. de 2022
 */
public class NotaCorretagemBuilder {

	private NotaCorretagem notaCorretagem;
	
	private NegocioMapper mapper;

	public NotaCorretagemBuilder() {
		this.notaCorretagem = new NotaCorretagem();
		mapper = new NegocioMapper();
	}
	
	public static NotaCorretagemBuilder builder() {
		return new NotaCorretagemBuilder();
	}
	
	public NotaCorretagemBuilder addNegocios(List<NegocioInput> negocios) {
		negocios.stream().peek(negocio -> negocio.setNotaCorretagem(this.notaCorretagem)).collect(Collectors.toList());
		this.notaCorretagem.setNegocios(negocios.stream().map(negocio -> mapper.map(negocio)).collect(Collectors.toList()));
		return this;
	}
	
	public NotaCorretagemBuilder addCorretora(Corretora corretora) {
		this.notaCorretagem.setCorretora(corretora);
		return this;
	}
	
	public NotaCorretagemBuilder addTaxaImpostos(BigDecimal taxasImpostos) {
		this.notaCorretagem.setTaxasImpostos(taxasImpostos);
		return this;
	}
	
	public NotaCorretagemBuilder addIrrf(BigDecimal irrf) {
		this.notaCorretagem.setIrrf(irrf);
		return this;
	}
	
	public NotaCorretagem get() {
		return this.notaCorretagem;
	}

}

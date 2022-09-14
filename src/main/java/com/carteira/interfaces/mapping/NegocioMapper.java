package com.carteira.interfaces.mapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.carteira.builder.NegocioBuilder;
import com.carteira.builder.NegocioOutputBuilder;
import com.carteira.domain.Negocio;
import com.carteira.interfaces.input.NegocioInput;
import com.carteira.interfaces.output.NegocioOutput;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 3 de jul. de 2022
 */
@Component
public class NegocioMapper {
	
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public Negocio map(NegocioInput input) {
		return NegocioBuilder.builder()
				.addIdTitulo(input.getIdTitulo())
				.addPreco(input.getPreco())
				.addQuantidade(input.getQuantidade())
				.addTipoMercado(input.getTipoMercado())
				.addTipoNegocio(input.getTipoNegocio())
				.addNotaCorretagem(input.getNotaCorretagem())
				.get();
	}
	
	/**
	 * 
	 * @param negocio
	 * @return
	 */
	public NegocioOutput map(Negocio negocio) {
		return NegocioOutputBuilder.builder()
				.addId(negocio.getId())
				.addPreco(negocio.getPreco())
				.addQuantidade(negocio.getQuantidade())
				.addTitulo(negocio.getTitulo())
				.addTipoMercado(negocio.getTipoMercado())
				.addTipoNegocio(negocio.getTipoNegocio())
				.get();
	}
	
	/**
	 * 
	 * @param negocios
	 * @return
	 */
	public List<NegocioOutput> map(List<Negocio> negocios){
		return negocios.stream().map(negocio -> map(negocio)).collect(Collectors.toList());
	}
}

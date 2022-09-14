package com.carteira.interfaces.mapping;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.carteira.builder.BolsaBuilder;
import com.carteira.builder.BolsaOutputBuilder;
import com.carteira.domain.Bolsa;
import com.carteira.interfaces.input.BolsaInput;
import com.carteira.interfaces.output.BolsaOutput;
/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 10 de jun. de 2022
 */
@Component
public class BolsaMapper {

	/**
	 * 
	 * @param input
	 * @return
	 */
	public Bolsa map(BolsaInput input) {
		return BolsaBuilder.builder()
				.addNome(input.getNome())
				.addSigla(input.getSigla())
				.setAtivo(input.isAtivo())
				.addDataCadastro(input.getDataCriacao() == null ? new Date() : input.getDataCriacao())
				.addDataFinalizacao(input.getDataFinalizacao())
				.get();
	}

	/**
	 * 
	 * @param bolsa
	 * @return
	 */
	public BolsaOutput map(Bolsa bolsa) {
		return BolsaOutputBuilder.builder()
				.addId(bolsa.getId())
				.addNome(bolsa.getNome())
				.addSigla(bolsa.getSigla())
				.setAtivo(bolsa.isAtivo())
				.addDataCadastro(bolsa.getDataCriacao())
				.addDataFinalizacao(bolsa.getDataFinalizacao())
				.get();
	}

	public List<BolsaOutput> map(List<Bolsa> bolsas) {
		return bolsas.stream().map(bolsa -> map(bolsa)).collect(Collectors.toList());
	}
}

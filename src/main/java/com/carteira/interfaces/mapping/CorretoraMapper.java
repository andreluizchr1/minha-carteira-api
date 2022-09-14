package com.carteira.interfaces.mapping;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.carteira.builder.CorretoraOutputBuilder;
import com.carteira.domain.Corretora;
import com.carteira.interfaces.input.CorretoraInput;
import com.carteira.interfaces.output.CorretoraOutput;
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
public class CorretoraMapper {

	public Corretora map(CorretoraInput input) {

		Corretora novaCorretora = new Corretora();

		novaCorretora.setNome(input.getNome());
		novaCorretora.setCnpj(input.getCnpj());
		novaCorretora.setDataCadastro(input.getDataCadastro() == null ? new Date() : input.getDataCadastro());
		novaCorretora.setDataFinalizacao(input.getDataFinalizacao());
		novaCorretora.setStatus(input.isAtivo());

		return novaCorretora;
	}

	public List<CorretoraOutput> map(List<Corretora> corretoras) {
		return corretoras.stream().map(corretora -> map(corretora)).collect(Collectors.toList());
	}

	public CorretoraOutput map(Corretora corretora) {
		return CorretoraOutputBuilder.builder()
				.addId(corretora.getId())
				.addCNPJ(corretora.getCnpj())
				.addDataCadastro(corretora.getDataCadastro())
				.addDataFinalizacao(corretora.getDataFinalizacao())
				.addNome(corretora.getNome())
				.addStatus(corretora.getStatus())
				.get();
	}

	public CorretoraOutput map(Optional<Corretora> corretora) {
		return map(corretora.get());
	}
}

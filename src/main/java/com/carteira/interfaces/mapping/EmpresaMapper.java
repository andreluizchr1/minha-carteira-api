package com.carteira.interfaces.mapping;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.carteira.builder.EmpresaBuilder;
import com.carteira.builder.EmpresaOutputBuilder;
import com.carteira.domain.Empresa;
import com.carteira.interfaces.input.EmpresaInput;
import com.carteira.interfaces.output.EmpresaOutput;
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
public class EmpresaMapper {

	/**
	 * 
	 * @param input
	 * @return
	 */
	public Empresa map(EmpresaInput input) {
		return EmpresaBuilder.builder()
				.addNome(input.getNome())
				.addCNPJ(input.getCnpj())
				.setStatus(input.isAtivo())
				.addDataCriacao(input.getDataCriacao() == null ? new Date() : input.getDataCriacao())
				.addDataFinalizacao(input.getDataFinalizacao()).get();
	}
	
	/**
	 * 
	 * @param empresa
	 * @return
	 */
	public EmpresaOutput map(Empresa empresa) {
		return EmpresaOutputBuilder.builder()
				.addCNPJ(empresa.getCnpj())
				.addDataCriacao(empresa.getDataCriacao())
				.addDataFinalizacao(empresa.getDataFinalizacao())
				.addId(empresa.getId())
				.addNome(empresa.getNome())
				.setAtivo(empresa.isAtivo())
				.get();
	}
	
	public List<EmpresaOutput> map(List<Empresa> empresas){
		return empresas
				.stream()
				.map(empresa -> map(empresa))
				.collect(Collectors.toList());
	}
}

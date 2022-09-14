package com.carteira.builder;

import java.util.Date;

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
public class EmpresaOutputBuilder {

	private EmpresaOutput empresaOutput;

	public EmpresaOutputBuilder() {
		this.empresaOutput = new EmpresaOutput();
	}

	public static EmpresaOutputBuilder builder() {
		return new EmpresaOutputBuilder();
	}

	public EmpresaOutputBuilder addId(Long id) {
		this.empresaOutput.setId(id);
		return this;
	}

	public EmpresaOutputBuilder addNome(String nome) {
		this.empresaOutput.setNome(nome);
		return this;
	}

	public EmpresaOutputBuilder addCNPJ(String cnpj) {
		this.empresaOutput.setCnpj(cnpj);
		return this;
	}

	public EmpresaOutputBuilder setAtivo(boolean ativo) {
		this.empresaOutput.setAtivo(ativo);
		return this;
	}

	public EmpresaOutputBuilder addDataCriacao(Date dataCriacao) {
		this.empresaOutput.setDataCriacao(dataCriacao);
		return this;
	}

	public EmpresaOutputBuilder addDataFinalizacao(Date dataFinalizacao) {
		this.empresaOutput.setDataFinalizacao(dataFinalizacao);
		return this;
	}

	public EmpresaOutput get() {
		return this.empresaOutput;
	}
}

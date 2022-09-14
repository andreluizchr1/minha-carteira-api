package com.carteira.builder;

import java.util.Date;

import com.carteira.interfaces.output.CorretoraOutput;

public class CorretoraOutputBuilder {

	private CorretoraOutput output;

	public CorretoraOutputBuilder() {
		this.output = new CorretoraOutput();
	}

	public static CorretoraOutputBuilder builder() {
		return new CorretoraOutputBuilder();
	}

	public CorretoraOutputBuilder addId(Long id) {
		this.output.setId(id);
		return this;
	}

	public CorretoraOutputBuilder addNome(String nome) {
		this.output.setNome(nome);
		return this;
	}

	public CorretoraOutputBuilder addCNPJ(String cnpj) {
		this.output.setCnpj(cnpj);
		return this;
	}

	public CorretoraOutputBuilder addDataCadastro(Date dataCadastro) {
		this.output.setDataCadastro(dataCadastro);
		return this;
	}
	
	public CorretoraOutputBuilder addDataFinalizacao(Date dataFinalizacao) {
		this.output.setDataFinalizacao(dataFinalizacao);
		return this;
	}

	public CorretoraOutputBuilder addStatus(boolean status) {
		this.output.setStatus(status);
		return this;
	}

	public CorretoraOutput get() {
		return this.output;
	}
}

package com.carteira.interfaces.mapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carteira.builder.TituloBuilder;
import com.carteira.builder.TituloOutputBuilder;
import com.carteira.domain.Titulo;
import com.carteira.interfaces.input.TituloInput;
import com.carteira.interfaces.output.TituloOutput;

/**
 * 
 * Projeto: minha-carteira
 *
 * 
 * Autor:   André Luiz Chaves Rodrigues
 * Contato: andreluizchr1@gmail.com
 * Data de Criação do Arquivo: 22 de jun. de 2022
 */
@Component
public class TituloMapper {
	
	@Autowired
	private EmpresaMapper empresaMapper;
	
	@Autowired
	private BolsaMapper bolsaMapper;

	/**
	 * 
	 * @param input
	 * @return
	 */
	public Titulo map(TituloInput input) {
		return TituloBuilder.builder()
				.addBolsa(input.getIdBolsa())
				.addEmpresa(input.getIdEmpresa())
				.addCodigo(input.getCodigo())
				.addDataInicialNegociacao(input.getDataInicialNegociacao())
				.addDataFinalNegociacao(input.getDataFinalNegociacao())
				.addStrike(input.getStrike())
				.setAtivo(input.isAtivo())
				.setOpcao(input.isOpcao())
				.setAcao(input.isAcao())
				.get();
	}
	
	/**
	 * 
	 * @param titulo
	 * @return
	 */
	public TituloOutput map(Titulo titulo) {
		return TituloOutputBuilder.builder()
				.addBolsa(bolsaMapper.map(titulo.getBolsa()))
				.addEmpresa(empresaMapper.map(titulo.getEmpresa()))
				.addCodigo(titulo.getCodigo())
				.addDataInicialNegociacao(titulo.getDataInicialNegociacao())
				.addDataFinalNegociacao(titulo.getDataFinalNegociacao())
				.addId(titulo.getId())
				.addStrike(titulo.getStrike())
				.setAcao(titulo.isAcao())
				.setOpcao(titulo.isOpcao())
				.setAtivo(titulo.isAtivo())
				.get();
	}
	
	/**
	 * 
	 * @param titulos
	 * @return
	 */
	public List<TituloOutput> map(List<Titulo> titulos){
		return titulos.stream().map(titulo -> map(titulo)).collect(Collectors.toList());
	}
}

package com.carteira.interfaces.mapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carteira.builder.NotaCorretagemBuilder;
import com.carteira.builder.NotaCorretagemOutputBuilder;
import com.carteira.domain.NotaCorretagem;
import com.carteira.interfaces.input.NotaCorretagemInput;
import com.carteira.interfaces.output.NotaCorretagemOutput;
import com.carteira.services.CorretoraService;

@Component
public class NotaCorretagemMapper {
	
	@Autowired
	private CorretoraService corretoraService;
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public NotaCorretagem map(NotaCorretagemInput input) {
		return NotaCorretagemBuilder.builder()
				.addCorretora(corretoraService.findById(input.getIdCorretora()).get())
				.addNegocios(input.getNegocios())
				.addTaxaImpostos(input.getTaxasImpostos())
				.addIrrf(input.getIrrf())
				.get();
	}
	
	/**
	 * 
	 * @param notaCorretagem
	 * @return
	 */
	public NotaCorretagemOutput map(NotaCorretagem notaCorretagem) {
		return NotaCorretagemOutputBuilder.builder()
				.addCorretora(notaCorretagem.getCorretora())
				.addNegocios(notaCorretagem.getNegocios())
				.addIrrf(notaCorretagem.getIrrf())
				.addTaxasImpostos(notaCorretagem.getTaxasImpostos())
				.get();
	}
	
	/**
	 * 
	 * @param notas
	 * @return
	 */
	public List<NotaCorretagemOutput> map(List<NotaCorretagem> notas){
		return notas.stream().map(nota -> map(nota)).collect(Collectors.toList());
	}
}

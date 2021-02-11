package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class EmAnalise {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

}

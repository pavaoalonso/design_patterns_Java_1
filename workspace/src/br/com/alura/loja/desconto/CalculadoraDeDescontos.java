package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public static BigDecimal calcular(Orcamento orcamento) {

		BigDecimal desconto = BigDecimal.ZERO;

		if (orcamento.getQntItens() > 5) {
			desconto = orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return desconto;
	}
}

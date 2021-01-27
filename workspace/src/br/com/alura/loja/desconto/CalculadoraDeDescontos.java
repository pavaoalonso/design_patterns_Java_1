package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public static BigDecimal calcular(Orcamento orcamento) {

		SemDesconto semDesconto = new SemDesconto();
		Desconto desconto2 = new DescontoParaOrcamentoComValorMaiorQueQuinhentos(semDesconto);
		Desconto desconto1 = new DescontoParaOrcamentoComMaisDeCincoItens(desconto2);

		return desconto1.calcular(orcamento);
	}
}

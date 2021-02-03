package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	/*
	 * TEMPLATE METHOD: m�todo concreto delegando a implementa��o do comportamento
	 * para os m�todos abstratos
	 * 
	 */
	public BigDecimal calcular(Orcamento orcamento) {

		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}

		return proximo.calcular(orcamento);
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	protected abstract boolean deveAplicar(Orcamento orcamento);

}

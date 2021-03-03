package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.DomainExcepetion;
import br.com.alura.loja.orcamento.Orcamento;

public class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new DomainExcepetion("Esse orçamento não pode ser aprovado!");
	}

	public void reprovar(Orcamento orcamento) {
		throw new DomainExcepetion("Esse orçamento não pode ser reprovado!");
	}

	public void finalizar(Orcamento orcamento) {
		throw new DomainExcepetion("Esse orçamento não pode ser finalizado!");
	}

}

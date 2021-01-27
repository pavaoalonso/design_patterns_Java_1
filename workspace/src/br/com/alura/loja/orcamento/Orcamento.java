package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private Integer qntItens;

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
		this.qntItens = 1;
	}

	public Orcamento(BigDecimal valor, Integer qntItens) {
		this.valor = valor;
		this.qntItens = qntItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Integer getQntItens() {
		return qntItens;
	}

}

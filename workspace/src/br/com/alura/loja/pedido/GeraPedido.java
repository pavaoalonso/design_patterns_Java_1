package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quatidadeItens;

	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quatidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quatidadeItens = quatidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuatidadeItens() {
		return quatidadeItens;
	}

}

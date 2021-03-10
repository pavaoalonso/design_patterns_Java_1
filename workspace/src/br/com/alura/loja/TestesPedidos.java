package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

public class TestesPedidos {

	public static void main(String[] args) {

		String cliente = "Ana";
		LocalDateTime data = LocalDateTime.now();
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);

		Pedido pedido = new Pedido(cliente, data, orcamento);

	}

}

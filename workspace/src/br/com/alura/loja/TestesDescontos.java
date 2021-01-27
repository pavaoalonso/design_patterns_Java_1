package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("10000"), 1);

		System.out.println(CalculadoraDeDescontos.calcular(orcamento));

	}

}

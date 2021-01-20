package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadorDeImpostos;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

		System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
	}

}

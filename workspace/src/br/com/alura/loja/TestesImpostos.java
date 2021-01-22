package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadorDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		System.out.println(CalculadorDeImpostos.calcular(orcamento, new ICMS()));
		
		System.out.println(CalculadorDeImpostos.calcular(orcamento, new ISS()));

	}

}

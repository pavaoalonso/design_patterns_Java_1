package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler {

	public void execute(GeraPedido dados) {

		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuatidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
		SalvarPedidoNoBancoDeDados salvarPedidoNoBancoDeDados = new SalvarPedidoNoBancoDeDados();
		
		enviarEmailPedido.executar(pedido);
		salvarPedidoNoBancoDeDados.executar(pedido);
	}
}

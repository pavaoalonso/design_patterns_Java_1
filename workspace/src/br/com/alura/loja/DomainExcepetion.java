package br.com.alura.loja;

public class DomainExcepetion extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1642812825594795612L;
	
	public DomainExcepetion(String mensagem) {
		super(mensagem);
	}

}

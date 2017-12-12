package br.com.sinapsis.exception;

@SuppressWarnings("serial")
public class RetrieveException extends Exception {

	public RetrieveException() {
		super("Erro ao buscar os dados no banco de dados.");
	}
	
}

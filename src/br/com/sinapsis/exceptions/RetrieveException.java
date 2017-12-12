package br.com.sinapsis.exceptions;

@SuppressWarnings("serial")
public class RetrieveException extends Exception {

	public RetrieveException(Exception e) {
		super("Erro ao buscar os dados no banco de dados.");
	}
	
}

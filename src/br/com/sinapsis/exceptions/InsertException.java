package br.com.sinapsis.exceptions;

@SuppressWarnings("serial")
public class InsertException extends Exception {

	public InsertException(Exception e){
		super("Erro ao inserir os dados no banco de dados.",e);
		
	}
	
}

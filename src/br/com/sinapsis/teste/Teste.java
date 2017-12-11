package br.com.sinapsis.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.sinapsis.dao.ConnectionManager;

public class Teste {

	public static void main(String[] args) {
	
		Connection conn = null;
		
		try {
			conn = ConnectionManager.getInstance().getConnection();
			System.out.println("conectado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
			System.out.println("desconectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

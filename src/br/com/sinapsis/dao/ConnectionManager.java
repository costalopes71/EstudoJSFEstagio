package br.com.sinapsis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static ConnectionManager instance;
	
	private ConnectionManager() throws ClassNotFoundException {
		
	}
	
	public static ConnectionManager getInstance() throws SQLException {
		
		if (instance == null) {
			try {
				instance = new ConnectionManager();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new SQLException("O driver JDBC não foi encontrado.");
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=EstudoEstagio;integratedSecurity=true;";
		String user = "root";
		String password = "";
		
		Connection conn;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao abrir a conexão com o banco de dados.");
		}
		return conn;
	}
	
}

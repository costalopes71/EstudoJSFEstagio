package br.com.sinapsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.sinapsis.entities.Ocorrencia;

public class OcorrenciaDAO {

	private Connection conn;
	
	public OcorrenciaDAO() throws SQLException {
		conn = ConnectionManager.getInstance().getConnection();
	}
	
	public void imprimirConsole(Ocorrencia ocorrencia) {
		System.out.println(ocorrencia);
	}
	
	public void adicionar(Ocorrencia ocorrencia) throws SQLException {
		
		String sql = "INSERT INTO T_OCORRENCIA (num_ocorrencia, dh_inicial, defeito_eqpto, x_defeito, y_defeito, causa, area, expurgo) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, ocorrencia.getNumero());
			pstm.setDate(2, new java.sql.Date(ocorrencia.getDataInicial().getTimeInMillis()));
			pstm.setString(3, ocorrencia.getDefeito());
			pstm.setDouble(4, ocorrencia.getLatitude());
			pstm.setDouble(5, ocorrencia.getLongitude());
			pstm.setInt(6, ocorrencia.getCausa().getId());
			pstm.setString(7, ocorrencia.getArea().getDescricao());
			pstm.setBoolean(8, ocorrencia.isExpurgo());
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pstm.close();
			if (conn != null) {
				conn.close();
			}
		}
		
	}
	
}

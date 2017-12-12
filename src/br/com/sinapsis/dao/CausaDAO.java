package br.com.sinapsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sinapsis.entities.Causa;

public class CausaDAO {

	private Connection conn;
	
	public CausaDAO() throws SQLException {
		conn = ConnectionManager.getInstance().getConnection();
	}
	
	public List<Causa> listar() throws SQLException {
		
		List<Causa> lista = new ArrayList<Causa>();
		String query = "SELECT * FROM T_CAUSA";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			Causa causa = null;
			
			while (rs.next()) {
				causa = new Causa();
				causa.setId(rs.getInt("id"));
				causa.setCodigo(rs.getString("codigo"));
				causa.setDescricao(rs.getString("descricao"));
				lista.add(causa);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao conectar ou manipular o banco de dados.");
		} finally {
			try {
				rs.close();
				pstm.close();
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SQLException("Erro ao fechar recursos relativos a banco de dados.");
			}
		}
		return lista;
	}
	
}
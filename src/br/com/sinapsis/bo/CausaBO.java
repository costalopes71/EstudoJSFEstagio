package br.com.sinapsis.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.sinapsis.dao.CausaDAO;
import br.com.sinapsis.entities.Causa;
import br.com.sinapsis.exception.RetrieveException;

public class CausaBO {

	private static CausaDAO causaDAO;
	
	public CausaBO() throws SQLException {
		if (causaDAO == null) {
			try {
				causaDAO = new CausaDAO();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SQLException();
			}
		}
	}
	
	public List<Causa> listar() throws RetrieveException {
		try {
			return causaDAO.listar();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RetrieveException();
		}
	}
	
}

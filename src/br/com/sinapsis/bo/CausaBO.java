package br.com.sinapsis.bo;

import java.sql.SQLException;
import java.util.List;
import br.com.sinapsis.dao.CausaDAO;
import br.com.sinapsis.entities.Causa;
import br.com.sinapsis.exceptions.RetrieveException;

public class CausaBO {

	private CausaDAO causaDAO;
	
	public CausaBO() throws SQLException {
		causaDAO = new CausaDAO();
	}
	
	public List<Causa> listar() throws RetrieveException {
		try {
			return causaDAO.listar();
		} catch (SQLException e) {
			throw new RetrieveException(e);
		}
	}
	
	public Causa buscar(int id) throws RetrieveException {
		try {
			return causaDAO.buscar(id);
		} catch (SQLException e) {
			throw new RetrieveException(e);
		}
		
		
	}
	
}

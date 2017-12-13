package br.com.sinapsis.bo;

import java.sql.SQLException;

import br.com.sinapsis.dao.OcorrenciaDAO;
import br.com.sinapsis.entities.Ocorrencia;
import br.com.sinapsis.exceptions.InsertException;

public class OcorrenciaBO {

	private OcorrenciaDAO dao;
	
	public OcorrenciaBO() throws Exception {
		dao = new OcorrenciaDAO();
	}
	
	public void adicionar(Ocorrencia ocorrencia) throws InsertException {
		try {
			dao.adicionar(ocorrencia);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new InsertException(e);
		}
	}
	
}

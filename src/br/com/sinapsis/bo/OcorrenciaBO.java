package br.com.sinapsis.bo;

import java.sql.SQLException;

import br.com.sinapsis.dao.OcorrenciaDAO;
import br.com.sinapsis.entities.Ocorrencia;
import br.com.sinapsis.exceptions.InsertException;

public class OcorrenciaBO {

	private static OcorrenciaDAO dao;
	
	public OcorrenciaBO() throws Exception {
		if (dao == null) {
			try {
				dao = new OcorrenciaDAO();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Erro ao acessar o banco", e);
			}
		}
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

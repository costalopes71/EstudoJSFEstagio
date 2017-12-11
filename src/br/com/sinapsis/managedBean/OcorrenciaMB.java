package br.com.sinapsis.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.sinapsis.dao.OcorrenciaDAO;
import br.com.sinapsis.entities.Ocorrencia;

@ManagedBean
@SessionScoped
public class OcorrenciaMB {

	private Ocorrencia ocorrencia;
	private OcorrenciaDAO ocorrenciaDAO = new OcorrenciaDAO();
	
	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}
	
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public OcorrenciaDAO getOcorrenciaDAO() {
		return ocorrenciaDAO;
	}
	
}

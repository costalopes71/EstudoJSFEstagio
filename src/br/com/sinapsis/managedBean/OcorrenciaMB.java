package br.com.sinapsis.managedBean;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sinapsis.bo.CausaBO;
import br.com.sinapsis.bo.OcorrenciaBO;
import br.com.sinapsis.dao.CausaDAO;
import br.com.sinapsis.entities.Causa;
import br.com.sinapsis.entities.Ocorrencia;
import br.com.sinapsis.exceptions.InsertException;

@ManagedBean
@RequestScoped
public class OcorrenciaMB {

	private Ocorrencia ocorrencia = new Ocorrencia();
	private int causaId;
	
	public int getCausaId() {
		return causaId;
	}
	
	public void setCausaId(int causaId) {
		this.causaId = causaId;
	}
	
	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}
	
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public List<Causa> getCausas() {
		try {
			return new CausaDAO().listar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public void adicionar() {
		
		try {
			ocorrencia.setCausa(new CausaBO().buscar(causaId));
			new OcorrenciaBO().adicionar(this.ocorrencia);
		} catch (InsertException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ocorrencia = new Ocorrencia();
	}
	
}

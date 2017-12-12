package br.com.sinapsis.managedBean;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sinapsis.bo.CausaBO;
import br.com.sinapsis.dao.CausaDAO;
import br.com.sinapsis.entities.Causa;
import br.com.sinapsis.entities.Ocorrencia;
import br.com.sinapsis.exceptions.RetrieveException;

@ManagedBean
@ViewScoped
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
	
	public void imprimirConsole() {
		try {
			ocorrencia.setCausa(new CausaBO().buscar(causaId));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println(ocorrencia.getNumero());
		System.out.println(ocorrencia.getLatitude());
		System.out.println(ocorrencia.getLongitude());
		System.out.println(ocorrencia.getDefeito());
		System.out.println(ocorrencia.isExpurgo());
		System.out.println(ocorrencia.getArea());
		System.out.println(ocorrencia.getCausa().getId() + " -- " + ocorrencia.getCausa().getDescricao() + " --- "  + 
		ocorrencia.getCausa().getCodigo());
		ocorrencia = new Ocorrencia();
	}
	
}

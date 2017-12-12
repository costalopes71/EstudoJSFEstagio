package br.com.sinapsis.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.sinapsis.bo.OcorrenciaBO;
import br.com.sinapsis.entities.Ocorrencia;

@ManagedBean
@SessionScoped
public class OcorrenciaMB {

	private Ocorrencia ocorrencia;
	private OcorrenciaBO ocorrenciaBO;
	
	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}
	
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
}

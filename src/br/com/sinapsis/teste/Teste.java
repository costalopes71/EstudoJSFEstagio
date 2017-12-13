package br.com.sinapsis.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.sinapsis.dao.CausaDAO;
import br.com.sinapsis.dao.OcorrenciaDAO;
import br.com.sinapsis.entities.Area;
import br.com.sinapsis.entities.Causa;
import br.com.sinapsis.entities.Ocorrencia;

public class Teste {

	public static void main(String[] args) {
	
		CausaDAO daoC = null;
		try {
			daoC = new CausaDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		Causa causa = null;
		try {
			causa = daoC.buscar(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//			System.out.println(causa.getCodigo() + " -- " + causa.getDescricao() + " --- " + causa.getId());
		
		OcorrenciaDAO dao = null;
		try {
			dao = new OcorrenciaDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ocorrencia ocr = new Ocorrencia();
		
		ocr.setArea(Area.RURAL);
		ocr.setCausa(causa);
		
		Calendar c = Calendar.getInstance();
		ocr.setDataInicial(c);
		ocr.setDefeito("qualquer defeito");
		ocr.setExpurgo(false);
		ocr.setNumero(5458);
		ocr.setLatitude(45.5454);
		ocr.setLongitude(447.88);

		try {
			dao.adicionar(ocr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}

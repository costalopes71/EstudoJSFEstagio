package br.com.sinapsis.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.sinapsis.dao.CausaDAO;
import br.com.sinapsis.entities.Causa;

public class Teste {

	public static void main(String[] args) {
	
		CausaDAO dao = null;
		try {
			dao = new CausaDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Causa causa = null;
		try {
			causa = dao.buscar(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			System.out.println(causa.getCodigo() + " -- " + causa.getDescricao() + " --- " + causa.getId());
		
	}
	
	
}

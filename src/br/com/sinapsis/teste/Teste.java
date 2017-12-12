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
		
		List<Causa> lista = null;
		try {
			lista = dao.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Causa causa : lista) {
			System.out.println(causa.getCodigo() + " -- " + causa.getDescricao() + " --- " + causa.getId());
		}
		
	}
	
	
}

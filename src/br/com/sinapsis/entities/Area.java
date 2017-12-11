package br.com.sinapsis.entities;

public enum Area {
	
	RURAL("rural"), URBANO("urbano");
	
	private String descricao;

	Area(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}

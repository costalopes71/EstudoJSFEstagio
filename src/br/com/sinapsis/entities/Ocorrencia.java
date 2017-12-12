package br.com.sinapsis.entities;

import java.time.LocalDate;

public class Ocorrencia {

	private int id;
	private int numero;
	private LocalDate dataInicial;
	private String defeito;
	private double latitude;
	private double longitude;
	private Causa causa;
	private Area area;
	private boolean expurgo;
	
	public Ocorrencia() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	
	public String getDefeito() {
		return defeito;
	}
	
	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public Causa getCausa() {
		return causa;
	}
	
	public void setCausa(Causa causa) {
		this.causa = causa;
	}
	
	public Area getArea() {
		return area;
	}
	
	public void setArea(Area area) {
		this.area = area;
	}
	
	public boolean isExpurgo() {
		return expurgo;
	}

	public void setExpurgo(boolean expurgo) {
		this.expurgo = expurgo;
	}

	@Override
	public String toString() {
		return "Ocorrencia [id=" + id + ", numero=" + numero + ", dataInicial=" + dataInicial + ", defeito=" + defeito
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", causa=" + causa + ", area=" + area
				+ ", expurgo=" + expurgo + "]";
	}
	
}

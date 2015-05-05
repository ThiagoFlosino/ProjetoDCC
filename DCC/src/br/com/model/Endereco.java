package br.com.model;

public class Endereco {
	
	private String logradouro;
	private String uf;
	private String pais;
	private int numero;
	private String complemento;
	
	
	
	public Endereco(String logradouro, String uf, String pais, int numero,
			String complemento) {

		this.logradouro = logradouro;
		this.uf = uf;
		this.pais = pais;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	
}

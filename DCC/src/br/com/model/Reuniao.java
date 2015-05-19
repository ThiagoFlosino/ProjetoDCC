package br.com.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Reuniao {
	@Id @GeneratedValue
	private Long id;
	public Date data;
	ArrayList<Comissao> comissoes;

	public Reuniao(ArrayList<Comissao> comissoes) {

		this.comissoes = comissoes;
	}

	public ArrayList<Comissao> getComissoes() {
		return comissoes;
	}

	public void setComissoes(ArrayList<Comissao> comissoes) {
		this.comissoes = comissoes;
	}
	
	
}

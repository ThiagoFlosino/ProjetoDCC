package br.com.model;

import java.util.ArrayList;

public class Reuniao {
	
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

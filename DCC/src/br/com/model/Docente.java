package br.com.model;

import javax.persistence.Entity;

@Entity
public class Docente extends Usuario{
	
	public Docente(String nome, String sobrenome, String cpf, 
			String matricula, Endereco endereco, Contato contato){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.matricula = matricula;	
		this.endereco = endereco;
		this.contato = contato;
	}

	public Docente() {
		// TODO Auto-generated constructor stub
	}

}

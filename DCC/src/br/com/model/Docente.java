package br.com.model;

public class Docente extends Usuario{
	
	public Docente(String nome, String sobrenome, String cpf, 
			String matricula, Endereco endereco, Contato contato) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.matricula = matricula;	
		this.endereco = endereco;
		this.contato = contato;
		
	}
	
	
	

}

package br.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public abstract class Usuario {
	
	@Id @GeneratedValue
	protected Long ID;
	protected String nome;
	protected String sobrenome;
	protected String cpf;
	protected String matricula;
	@OneToOne(cascade=CascadeType.ALL)
	protected Endereco endereco;
	@OneToOne(cascade=CascadeType.ALL)
	protected Contato contato;
/*	@OneToMany
	protected Reuniao reuniao;
	*/
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@OneToOne(cascade=CascadeType.ALL)
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@OneToOne(cascade=CascadeType.ALL)
 	public Contato getContato() {
 
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
/*	public Reuniao getReuniao() {
		return reuniao;
	}
	public void setReuniao(Reuniao reuniao) {
		this.reuniao = reuniao;
	}
*/
	public String toString(){
		return "Nome: " + this.nome +
				"\n Sobrenome: " + this.sobrenome +
				"\n Matricula: " + this.matricula +
				"\n Contato: " + this.contato +
				"\n Endereço: " + this.endereco;
	}
}

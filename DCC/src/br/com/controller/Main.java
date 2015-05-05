package br.com.controller;

import br.com.model.Docente;
import br.com.model.Usuario;



public class Main {

	public static void main(String[] args) {
		Usuario doc1 = new Docente("Carlos", "de tal", "123456789-01", "123456789", null, null);
		
		System.out.println("Matricula: " + doc1.getMatricula());
		System.out.println(doc1);


	}

}

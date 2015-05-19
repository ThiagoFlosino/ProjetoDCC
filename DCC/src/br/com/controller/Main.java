package br.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.Session;

import br.com.model.Contato;
import br.com.model.Docente;
import br.com.model.Endereco;
import br.com.model.Usuario;



public class Main {

	public static void main(String[] args) throws InterruptedException {
/*
		Endereco ed = new Endereco("Rua Dalva Raposo", "RJ", "Brasil", 10, "Tribobó");
		Contato cont = new Contato("21 39012407", "21 994196067", "thiagoflosino@gmail.com");
		Docente doc1 = new Docente("Thiago", "Leite", "001asda331230-01", "0123asdasd3", ed, cont);
		
		
		/*
		System.out.println("Matricula: " + doc1.getMatricula());
		System.out.println(doc1);
		
		EntityManager em = Connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(doc1);
		em.toString();
		em.getTransaction().commit();
		System.out.println("Commitou");
		
		Query q = em.createQuery("SELECT a FROM Docente a", Docente.class);
		List<Usuario> doc = q.getResultList();
		
		for(Usuario a : doc){
			System.out.println(a);
		}
		System.out.println("Upou");

		
		em.close();
		//Connection.closeConnection();
/*
		Query q = em.createQuery("SELECT a FROM Docente a", Docente.class);
		
		List<Docente> doc = q.getResultList();
		
		for(Docente a : doc){
			System.out.println(a);
		}
		System.out.println("Upou");
		em.close();
		Connection.closeConnection();
*/

	}
}

package br.com.model;

import java.util.Date;


public class Comissao {
	
	private Date dataFim;
	private Date dataInicio;
	private String tarefa;
	public Comissao(Date dataFim, Date dataInicio, String tarefa) {
	
		this.dataFim = dataFim;
		this.dataInicio = dataInicio;
		this.tarefa = tarefa;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
	
	
}

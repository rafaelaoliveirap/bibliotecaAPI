package com.biblioteca.biblioteca.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "emprestimo")
public class Emprestimo {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
		
	@NotNull
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dtDevolucao = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dtRetirada = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="isbn", referencedColumnName="isbn") 
	private Livro livro;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idCliente", referencedColumnName="idCliente") 
	 private Cliente cliente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public Date getDtRetirada() {
		return dtRetirada;
	}

	public void setDtRetirada(Date dtRetirada) {
		this.dtRetirada = dtRetirada;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}

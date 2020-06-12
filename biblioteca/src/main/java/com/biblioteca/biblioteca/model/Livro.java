package com.biblioteca.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="livro")

public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long isbn;
	
	@NotNull
	@Size(min=2,max=100)
	private String genero;
	
	@Size()
	private long qtdLivros;
	
	@NotNull
	@Size(min=2,max=80)
	private String nomeLivro;

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public long getQtdLivros() {
		return qtdLivros;
	}

	public void setQtdLivros(long qtdLivros) {
		this.qtdLivros = qtdLivros;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}


}

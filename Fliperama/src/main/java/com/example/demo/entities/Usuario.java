package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class Usuario {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name")
	private String nome;
	
	@Column(name = "user_nickname")
	private String apelido;
	
	
	@JsonIgnore
	@ManyToMany(cascade = {
			CascadeType.ALL
	}, mappedBy = "usuarios")
	List<Sala> salas;


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Usuario() {
		super();
	}


	public Usuario(String nome, String apelido) {
		super();
		this.nome = nome;
		this.apelido = apelido;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public List<Sala> getSalas() {
		return salas;
	}


	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	
	
	
	
	
	
	
}

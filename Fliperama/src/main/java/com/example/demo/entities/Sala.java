package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "room")
public class Sala {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name_room")
	private String nome;
	
	@Column(name = "game_gen")
	private String gameGen;
	
	
    @JsonIgnore
	@OneToMany(mappedBy = "sala")
	private List<Servidor> servidores = new ArrayList<Servidor>();

	@ManyToOne
	@JoinColumn(name = "game_fk")
	private Jogo jogo;
	
	
	@ManyToMany(cascade = {			
	            CascadeType.ALL
	            })
	@JoinTable(name = "users_rooms",
	joinColumns = {@JoinColumn(name="room_fk")},
	inverseJoinColumns = {@JoinColumn(name="user_fk")}
			)
	private List<Usuario> usuarios;
	
	
	
	
	
	
	
	
	
	
	public Sala() {
		super();
	}





	public Sala(Long id, String nome, String gameGen) {
		super();
		this.id = id;
		this.nome = nome;
		this.gameGen = gameGen;
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





	public String getGameGen() {
		return gameGen;
	}





	public void setGameGen(String gameGen) {
		this.gameGen = gameGen;
	}





	public Jogo getJogo() {
		return jogo;
	}





	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
	
	
	
	
	
	
	
}

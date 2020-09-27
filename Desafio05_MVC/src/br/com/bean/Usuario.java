package br.com.bean;

public class Usuario {
	private String nome;
	private Integer idade;
	
	//Constructor
	public Usuario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}
}

package DAO;

public class UsuarioDAO {
	private String nome;
	private Integer idade;
	
	//Constructor
	public UsuarioDAO(String nome, Integer idade) {
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

package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.Usuario;

public class UsuarioDAO {
	private List<Usuario> usuario = new ArrayList<Usuario>();
	

	public List<Usuario> mostrarUsuario() {
		return usuario;
	}

	public void adicionarUsuario(Usuario usuario) {
		this.usuario.add(usuario);
	}
	
	public void abastecerList() {
		Usuario u = new Usuario("Mateus", 22);
		this.usuario.add(u);
		Usuario u1 = new Usuario("Júlio", 23);
		this.usuario.add(u1);
		Usuario u2 = new Usuario("Ester", 12);
		this.usuario.add(u2);
		Usuario u3 = new Usuario("Laura", 32);
		this.usuario.add(u3);
		Usuario u4 = new Usuario("Fabrício",42);
		this.usuario.add(u4);
		Usuario u5 = new Usuario("Lucas", 43);
		this.usuario.add(u5);
		Usuario u6 = new Usuario("Neto", 22);
		this.usuario.add(u6);
		Usuario u7 = new Usuario("Marcos", 22);
		this.usuario.add(u7);
		
	}

}

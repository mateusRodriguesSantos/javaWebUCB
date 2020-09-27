package br.com.bo;

import java.util.List;

import br.com.bean.*;
import br.com.dao.*;


public class UsuarioBO {
	private UsuarioDAO uDAO = new UsuarioDAO();
	
	public List<Usuario> listarUsuarios(){
		return uDAO.mostrarUsuario();
	}
	
	public UsuarioBO() {
		uDAO.abastecerList();
	}

	public UsuarioDAO getuDAO() {
		return uDAO;
	}
	
}

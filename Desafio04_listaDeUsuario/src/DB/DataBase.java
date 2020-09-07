package DB;
import java.util.ArrayList;
import java.util.List;

import DAO.UsuarioDAO;

public class DataBase {
	private List<UsuarioDAO> usuario = new ArrayList<UsuarioDAO>();
	

	public List<UsuarioDAO> mostrarUsuario() {
		return usuario;
	}

	public void adicionarUsuario(UsuarioDAO usuario) {
		this.usuario.add(usuario);
	}
}

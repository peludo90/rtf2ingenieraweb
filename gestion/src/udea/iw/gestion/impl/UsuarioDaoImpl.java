package udea.iw.gestion.impl;

import java.util.List;

import udea.iw.gestion.dao.UsuarioDAO;
import udea.iw.gestion.dto.Tipo_usuario;
import udea.iw.gestion.dto.Usuario;
import udea.iw.gestion.util.exception.GestionException;

public class UsuarioDaoImpl implements UsuarioDAO{

	@Override
	public List<Usuario> obtenerTodos() throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUnico(int id_usuario) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> obtenerPorTipo_usuario(Tipo_usuario tipo_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizarUsuario(int id_Usuario, Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarUsuario(int id_Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUsuario(String nombre, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

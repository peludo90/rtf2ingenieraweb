package udea.iw.gestion.impl;

import java.util.List;

import udea.iw.gestion.dao.UsuarioSimpleDAO;
import udea.iw.gestion.dto.Tipo_usuario;
import udea.iw.gestion.dto.UsuarioSimple;
import udea.iw.gestion.util.exception.GestionException;

public class UsuarioSimpleDaoImpl implements UsuarioSimpleDAO{

	@Override
	public List<UsuarioSimple> obtenerTodos() throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioSimple obtenerUnico(int id_usuario) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioSimple> obtenerPorTipo_usuario(Tipo_usuario tipo_usuario) throws GestionException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarUsuario(int id_Usuario) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

}

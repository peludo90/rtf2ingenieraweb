package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Tipo_usuario;
import udea.iw.gestion.dto.UsuarioSimple;
import udea.iw.gestion.util.exception.GestionException;

public interface UsuarioSimpleDAO {

	public List<UsuarioSimple> obtenerTodos() throws GestionException;
	
	public UsuarioSimple obtenerUnico(int id_usuario) throws GestionException;
	
	public List<UsuarioSimple> obtenerPorTipo_usuario(Tipo_usuario tipo_usuario) throws GestionException;
	
	public Boolean eliminarUsuario(int id_Usuario) throws GestionException;
	
}

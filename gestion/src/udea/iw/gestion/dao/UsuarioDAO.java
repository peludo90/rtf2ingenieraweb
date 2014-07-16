package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Tipo_usuario;
import udea.iw.gestion.dto.Usuario;
import udea.iw.gestion.util.exception.GestionException;

public interface UsuarioDAO {

	public List<Usuario> obtenerTodos() throws GestionException;

	public Usuario obtenerUnico(int id_usuario) throws GestionException;

	public List<Usuario> obtenerPorTipo_usuario(Tipo_usuario tipo_usuario);

	public Boolean agregarUsuario(Usuario usuario);

	public Boolean actualizarUsuario(int id_Usuario, Usuario Usuario);

	public Boolean eliminarUsuario(int id_Usuario);

	public Usuario obtenerUsuario(String nombre, String password);

}

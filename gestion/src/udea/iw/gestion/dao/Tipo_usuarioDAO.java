package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Tipo_usuario;
import udea.iw.gestion.util.exception.GestionException;

public interface Tipo_usuarioDAO {

	public List<Tipo_usuario> obtenerTodos();

	public Tipo_usuario obtenerUnico(int id_tipo_usuario) throws GestionException;

	public Boolean agregarTipo_usuario(Tipo_usuario tipo_usuario);

	public Boolean actualizarTipo_usuario(int id_Tipo_usuario, Tipo_usuario tipo_usuario);

	public Boolean eliminarTipo_usuario(int id_tipo_usuario);
}

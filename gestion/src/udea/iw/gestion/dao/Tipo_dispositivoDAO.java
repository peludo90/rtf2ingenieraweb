package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Tipo_dispositivo;
import udea.iw.gestion.util.exception.GestionException;

public interface Tipo_dispositivoDAO {

	public List<Tipo_dispositivo> obtenerTodos();

	public Tipo_dispositivo obtenerUnico(int id_tipo_dispositivo) throws GestionException;

	public Boolean agregarTipo_dispositivo(Tipo_dispositivo tipo_dispositivo);

	public Boolean actualizarTipo_dispositivo(int id_tipo_dispositivo, Tipo_dispositivo tipo_dispositivo);

	public Boolean eliminarTipo_dispositivo(int id_tipo_dispositivo);
	
}

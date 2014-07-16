package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Estado_dispositivo;
import udea.iw.gestion.util.exception.GestionException;

public interface Estado_dispositivoDAO {

	public List<Estado_dispositivo> obtenerTodos();

	public Estado_dispositivo obtenerUnico(int id_estado_dispositivo) throws GestionException;

	public Boolean agregarEstado_dispositivo(Estado_dispositivo estado_dispositivo);

	public Boolean actualizarEstado_dispositivo(int id_estado_dispositivo, Estado_dispositivo estado_dispositivo);

	public Boolean eliminarEstado_dispositivo(int id_estado_dispositivo);

}

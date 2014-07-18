package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Estado_solicitud;
import udea.iw.gestion.util.exception.GestionException;

public interface Estado_solicitudDAO {

	public List<Estado_solicitud> obtenerTodos() throws GestionException;

	public Estado_solicitud obtenerUnico(int id_estado_solicitud) throws GestionException;

	public Boolean agregarEstado_solicitud(Estado_solicitud estado_solicitud) throws GestionException;

	public Boolean actualizarEstado_solicitud(int id_estado_estado, Estado_solicitud estado_solicitud) throws GestionException;

	public Boolean eliminarEstado_solicitud(int id_estado_solicitud) throws GestionException;
	
}

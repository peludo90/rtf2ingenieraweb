package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Estado_prestamo;
import udea.iw.gestion.util.exception.GestionException;

public interface Estado_prestamoDAO {
	
	public List<Estado_prestamo> obtenerTodos() throws GestionException;

	public Estado_prestamo obtenerUnico(int id_estado_prestamo) throws GestionException;

	public Boolean agregarEstado_prestamo(Estado_prestamo estado_prestamo) throws GestionException;

	public Boolean actualizarEstado_prestamo(int id_estado_prestamo, Estado_prestamo estado_prestamo) throws GestionException;

	public Boolean eliminarEstado_prestamo(int id_estado_prestamo) throws GestionException;

}

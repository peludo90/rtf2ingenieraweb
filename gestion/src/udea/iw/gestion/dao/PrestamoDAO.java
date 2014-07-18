package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Estado_prestamo;
import udea.iw.gestion.dto.Prestamo;
import udea.iw.gestion.dto.Solicitud;
import udea.iw.gestion.util.exception.GestionException;

public interface PrestamoDAO {

	public List<Prestamo> obtenerTodos() throws GestionException;
	
	public Prestamo obtenerUnico(int id_prestamo) throws GestionException;
	
	public Prestamo obtenerUnicoConSolicitud(int id_solicitud) throws GestionException;
	
	public List<Prestamo> obtenerPorEstado(Estado_prestamo estado_prestamo) throws GestionException;
	
	public List<Prestamo> obtenerPorUsuario(int id_usuario) throws GestionException;
	
	public List<Prestamo> obtenerPorAdmin_entrega(int id_usuario) throws GestionException;
	
	public List<Prestamo> obtenerPorAdmin_recibe(int id_usuario) throws GestionException;

	public Boolean agregarPrestamo(Prestamo prestamo) throws GestionException;
	
	public Boolean actualizarPrestamo(int id_prestamo, Prestamo prestamo) throws GestionException;
	
	public Boolean eliminarDispositivo(int id_prestamo) throws GestionException;
	
	
	
}

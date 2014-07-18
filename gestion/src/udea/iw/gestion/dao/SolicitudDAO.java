package udea.iw.gestion.dao;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import udea.iw.gestion.dto.Estado_solicitud;
import udea.iw.gestion.dto.Solicitud;
import udea.iw.gestion.util.exception.GestionException;

public interface SolicitudDAO {

	public List<Solicitud> obtenerTodos() throws GestionException;

	public Solicitud obtenerUnico(int id_solicitud) throws GestionException;
	
	public List<Solicitud> obtenerPorFecha_creacion(Date fecha_creacion) throws GestionException;
	
	public List<Solicitud> obtenerPorFecha_prestamo(Date fecha_prestamo) throws GestionException;
	
	public List<Solicitud> obtenerPorHora_salida(Time hora_salida) throws GestionException;
	
	public List<Solicitud> obtenerPorHora_entrada(Time hora_entrada) throws GestionException;
	
	public List<Solicitud> obtenerPorEstado(Estado_solicitud estado_solicitud) throws GestionException;
	
	public List<Solicitud> obtenerPorUsuario(int id_usuario) throws GestionException;
	
	public List<Solicitud> obtenerPorDispositivo(int id_dispositivo) throws GestionException;
	
	public List<Solicitud> obtenerPorAdmin_acepta(int id_usuario) throws GestionException;

	public Boolean agregarSolicitud(Solicitud solicitud) throws GestionException;
	
	public Boolean actualizarSolicitud(int id_prestamo, Solicitud solicitud) throws GestionException;
	
	public Boolean eliminarSolicitud(int id_prestamo) throws GestionException;
	
}

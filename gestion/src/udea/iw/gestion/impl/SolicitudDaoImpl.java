package udea.iw.gestion.impl;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import udea.iw.gestion.dao.SolicitudDAO;
import udea.iw.gestion.dto.Estado_solicitud;
import udea.iw.gestion.dto.Solicitud;
import udea.iw.gestion.util.exception.GestionException;

public class SolicitudDaoImpl implements SolicitudDAO{

	@Override
	public List<Solicitud> obtenerTodos() throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Solicitud obtenerUnico(int id_solicitud) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorFecha_creacion(Date fecha_creacion) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorFecha_prestamo(Date fecha_prestamo) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorHora_salida(Time hora_salida) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorHora_entrada(Time hora_entrada) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorEstado(Estado_solicitud estado_solicitud) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorUsuario(int id_usuario) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorDispositivo(int id_dispositivo) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> obtenerPorAdmin_acepta(int id_usuario) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean agregarSolicitud(Solicitud solicitud) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizarSolicitud(int id_prestamo, Solicitud solicitud) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarSolicitud(int id_prestamo) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

}

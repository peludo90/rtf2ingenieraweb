package udea.iw.gestion.impl;

import java.util.List;

import udea.iw.gestion.dao.PrestamoDAO;
import udea.iw.gestion.dto.Estado_prestamo;
import udea.iw.gestion.dto.Prestamo;
import udea.iw.gestion.util.exception.GestionException;

public class PrestamoDaoImpl implements PrestamoDAO{

	@Override
	public List<Prestamo> obtenerTodos() throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestamo obtenerUnico(int id_prestamo) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prestamo obtenerUnicoConSolicitud(int id_solicitud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> obtenerPorEstado(Estado_prestamo estado_prestamo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> obtenerPorUsuario(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> obtenerPorAdmin_entrega(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> obtenerPorAdmin_recibe(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean agregarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizarPrestamo(int id_prestamo, Prestamo prestamo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarDispositivo(int id_prestamo) {
		// TODO Auto-generated method stub
		return null;
	}

}

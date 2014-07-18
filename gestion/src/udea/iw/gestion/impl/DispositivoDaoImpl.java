package udea.iw.gestion.impl;

import java.util.List;

import udea.iw.gestion.dao.DispositivoDAO;
import udea.iw.gestion.dto.Dispositivo;
import udea.iw.gestion.dto.Estado_dispositivo;
import udea.iw.gestion.dto.Tipo_dispositivo;
import udea.iw.gestion.util.exception.GestionException;

public class DispositivoDaoImpl implements DispositivoDAO{

	@Override
	public List<Dispositivo> obtenerTodos() throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dispositivo obtenerUnico(int id_dispositivo) throws GestionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dispositivo> obtenerPorEstado(
			Estado_dispositivo estado_dispositivo) throws GestionException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dispositivo> obtenerPorTipo(Tipo_dispositivo tipo_dispositivo) throws GestionException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean agregarDispositivo(Dispositivo dispositivo) throws GestionException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizarDispositivo(int id_dispositivo,
			Dispositivo dispositivo)  throws GestionException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarDispositivo(int id_dispositivo) throws GestionException{
		// TODO Auto-generated method stub
		return null;
	}

}

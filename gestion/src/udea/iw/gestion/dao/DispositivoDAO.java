package udea.iw.gestion.dao;

import java.util.List;

import udea.iw.gestion.dto.Dispositivo;
import udea.iw.gestion.dto.Estado_dispositivo;
import udea.iw.gestion.dto.Tipo_dispositivo;
import udea.iw.gestion.util.exception.GestionException;

public interface DispositivoDAO {

	
	public List<Dispositivo> obtenerTodos() throws GestionException;
	
	public Dispositivo obtenerUnico(int id_dispositivo) throws GestionException;
	
	public List<Dispositivo> obtenerPorEstado(Estado_dispositivo estado_dispositivo);
	
	public List<Dispositivo> obtenerPorTipo(Tipo_dispositivo tipo_dispositivo);
	
	public Boolean agregarDispositivo(Dispositivo dispositivo);
	
	public Boolean actualizarDispositivo(int id_dispositivo, Dispositivo dispositivo);
	
	public Boolean eliminarDispositivo(int id_dispositivo);
	
}

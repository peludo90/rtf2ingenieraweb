package udea.iw.gestion.dto;

import java.io.Serializable;

public class Estado_dispositivo implements Serializable {

	private int id_estado_dispositivo;
	private String nombre;
	
	public Estado_dispositivo(){
		
	}

	public int getId_estado_dispositivo() {
		return id_estado_dispositivo;
	}

	private void setId_estado_dispositivo(int id_estado_dispositivo) {
		this.id_estado_dispositivo = id_estado_dispositivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

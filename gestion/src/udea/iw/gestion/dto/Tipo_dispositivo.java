package udea.iw.gestion.dto;

import java.io.Serializable;

public class Tipo_dispositivo implements Serializable {

	private int id_tipo_dispositivo;
	private String nombre;
	private String modelo;
	private String descripcion;
	private int fragilidad;
	
	public int getId_tipo_dispositivo() {
		return id_tipo_dispositivo;
	}
	private void setId_tipo_dispositivo(int id_tipo_dispositivo) {
		this.id_tipo_dispositivo = id_tipo_dispositivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getFragilidad() {
		return fragilidad;
	}
	public void setFragilidad(int fragilidad) {
		this.fragilidad = fragilidad;
	}
	
	
	
}

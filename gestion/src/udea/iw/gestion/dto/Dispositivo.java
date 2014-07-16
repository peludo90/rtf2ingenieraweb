package udea.iw.gestion.dto;

public class Dispositivo {

	private int id_dispositivo;
	private Tipo_dispositivo tipo_dispositivo;
	private Estado_dispositivo estado_dispositivo;
	private String detalles_cambios;

	public Dispositivo() {
		// TODO Auto-generated constructor stub
	}

	public int getId_dispositivo() {
		return id_dispositivo;
	}

	private void setId_dispositivo(int id_dispositivo) {
		this.id_dispositivo = id_dispositivo;
	}

	public Tipo_dispositivo getTipo_dispositivo() {
		return tipo_dispositivo;
	}

	public void setTipo_dispositivo(Tipo_dispositivo tipo_dispositivo) {
		this.tipo_dispositivo = tipo_dispositivo;
	}

	public Estado_dispositivo getEstado_dispositivo() {
		return estado_dispositivo;
	}

	public void setEstado_dispositivo(Estado_dispositivo estado_dispositivo) {
		this.estado_dispositivo = estado_dispositivo;
	}

	public String getDetalles_cambios() {
		return detalles_cambios;
	}

	public void setDetalles_cambios(String detalles_cambios) {
		this.detalles_cambios = detalles_cambios;
	}

}

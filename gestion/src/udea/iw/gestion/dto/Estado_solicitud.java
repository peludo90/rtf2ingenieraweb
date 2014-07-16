package udea.iw.gestion.dto;

public class Estado_solicitud {

	private int id_estado_solicitud;
	private String nombre;

	public Estado_solicitud() {
		// TODO Auto-generated constructor stub
	}

	public int getId_estado_solicitud() {
		return id_estado_solicitud;
	}

	private void setId_estado_solicitud(int id_estado_solicitud) {
		this.id_estado_solicitud = id_estado_solicitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

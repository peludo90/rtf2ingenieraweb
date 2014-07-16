package udea.iw.gestion.dto;

public class Estado_prestamo {

	private int id_estado_prestamo;
	private String nombre;

	public Estado_prestamo() {
		// TODO Auto-generated constructor stub
	}

	public int getId_estado_prestamo() {
		return id_estado_prestamo;
	}

	private void setId_estado_prestamo(int id_estado_prestamo) {
		this.id_estado_prestamo = id_estado_prestamo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

package udea.iw.gestion.dto;

public class Prestamo {

	private int id_prestamo;
	private Solicitud solicitud;
	private Estado_prestamo estado_prestamo;
	private UsuarioSimple admin_entrega;
	private UsuarioSimple admin_recibe;
	private String detalle_prestamo;

	public Prestamo(){
		
	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	private void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public Estado_prestamo getEstado_prestamo() {
		return estado_prestamo;
	}

	public void setEstado_prestamo(Estado_prestamo estado_prestamo) {
		this.estado_prestamo = estado_prestamo;
	}

	public UsuarioSimple getAdmin_entrega() {
		return admin_entrega;
	}

	public void setAdmin_entrega(UsuarioSimple admin_entrega) {
		this.admin_entrega = admin_entrega;
	}

	public UsuarioSimple getAdmin_recibe() {
		return admin_recibe;
	}

	public void setAdmin_recibe(UsuarioSimple admin_recibe) {
		this.admin_recibe = admin_recibe;
	}

	public String getDetalle_prestamo() {
		return detalle_prestamo;
	}

	public void setDetalle_prestamo(String detalle_prestamo) {
		this.detalle_prestamo = detalle_prestamo;
	}
	
	
	
}
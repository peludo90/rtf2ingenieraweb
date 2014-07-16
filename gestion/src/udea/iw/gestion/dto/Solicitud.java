package udea.iw.gestion.dto;

import java.sql.Time;
import java.util.Date;

public class Solicitud {

	private int id_solicitud;
	private UsuarioSimple usuario;
	private Dispositivo dispositivo;
	private Estado_solicitud estado_solicitud;
	private UsuarioSimple admin_responde;
	private Date fecha_creacion;
	private Date fecha_prestamo;
	private Time hora_salida;
	private Time hora_entrada;

	public Solicitud() {
		// TODO Auto-generated constructor stub
	}

	public int getId_solicitud() {
		return id_solicitud;
	}

	private void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}

	public UsuarioSimple getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioSimple usuario) {
		this.usuario = usuario;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Estado_solicitud getEstado_solicitud() {
		return estado_solicitud;
	}

	public void setEstado_solicitud(Estado_solicitud estado_solicitud) {
		this.estado_solicitud = estado_solicitud;
	}

	public UsuarioSimple getAdmin_responde() {
		return admin_responde;
	}

	public void setAdmin_responde(UsuarioSimple admin_responde) {
		this.admin_responde = admin_responde;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}

	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public Time getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(Time hora_salida) {
		this.hora_salida = hora_salida;
	}

	public Time getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(Time hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

}
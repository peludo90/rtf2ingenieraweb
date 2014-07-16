package udea.iw.gestion.dto;

public class Usuario {

	private int id_usuario;
	private Tipo_usuario tipo_usuario;
	private String nombre_usuario;
	private String documento;
	private String password;
	private String programa_academico;
	private String mail;
	private String telefono;
	private String celular;


	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public int getId_usuario() {
		return id_usuario;
	}


	private void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public Tipo_usuario getTipo_usuario() {
		return tipo_usuario;
	}


	public void setTipo_usuario(Tipo_usuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}


	public String getNombre_usuario() {
		return nombre_usuario;
	}


	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPrograma_academico() {
		return programa_academico;
	}


	public void setPrograma_academico(String programa_academico) {
		this.programa_academico = programa_academico;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}

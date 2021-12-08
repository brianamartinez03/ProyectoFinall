package logico;

import java.io.Serializable;

public class Administrador extends Usuario implements Serializable{

	
	private String puestoLaboral;
	private String user;
	private String contrasena;

	

	public Administrador( String idUsuario, String nombre, String telefono, String puestoLaboral, String user,String contrasena) {
		super( idUsuario, nombre, telefono);
		this.puestoLaboral = puestoLaboral;
	}
	

	public String getPuestoLaboral() {
		return puestoLaboral;
	}

	public void setPuestoLaboral(String puestoLaboral) {
		this.puestoLaboral = puestoLaboral;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}
	
	
	

}

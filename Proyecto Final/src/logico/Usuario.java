package logico;

import java.io.Serializable;

public abstract class Usuario implements Serializable{

	
	protected String idUsuario;
	protected String nombre;
	protected String telefono;
	
	public Usuario( String idUsuario, String nombre, String telefono) {
		super();
		
		this.idUsuario = idUsuario;
	
		this.nombre = nombre;
		this.telefono = telefono;
	}
	

	


	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}

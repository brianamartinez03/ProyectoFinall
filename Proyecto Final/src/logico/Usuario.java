package logico;

public abstract class Usuario {

	protected String CodUsuario;
	protected String idUsuario;
	protected String nombre;
	protected String telefono;
	
	public Usuario(String codUsuario, String idUsuario, String nombre, String telefono) {
		super();
		this.CodUsuario = codUsuario;
		this.idUsuario = idUsuario;
	
		this.nombre = nombre;
		this.telefono = telefono;
	}
	

	public String getCodUsuario() {
		return CodUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.CodUsuario = codUsuario;
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

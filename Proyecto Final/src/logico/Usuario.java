package logico;

public abstract class Usuario {

	protected String codUsuario;
	protected String login;
	protected String idUsuario;
	protected String password;
	protected String nombre;
	protected String telefono;
	
	public Usuario(String codUsuario, String login, String idUsuario, String password, String nombre, String telefono) {
		super();
		this.codUsuario = codUsuario;
		this.login = login;
		this.idUsuario = idUsuario;
		this.password = password;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

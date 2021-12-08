package logico;

import java.io.Serializable;

public class Medico extends Usuario implements Serializable {

	private String codMedico;
	private String especialidad;
	private String user;
	private String pass;
	
	
	public Medico(String codUsuario, String idUsuario, String nombre, String telefono, String codMedico,
			String especialidad, String user, String pass) {
		super(codUsuario, idUsuario, nombre, telefono);
		this.codMedico = codMedico;
		this.especialidad = especialidad;
		this.user = user;
		this.pass = pass;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getCodMedico() {
		return codMedico;
	}


	public void setCodMedico(String codMedico) {
		this.codMedico = codMedico;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

}

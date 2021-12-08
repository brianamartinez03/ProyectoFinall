package logico;

import java.io.Serializable;

public class Medico extends Usuario implements Serializable {

	private String codMedico;
	private String especialidad;
	private String usuario;
	private String pass;
	
	
	public Medico(String idUsuario, String nombre, String telefono, String codMedico, String especialidad,
			String usuario, String pass) {
		super(idUsuario, nombre, telefono);
		this.codMedico = codMedico;
		this.especialidad = especialidad;
		this.usuario = usuario;
		this.pass = pass;
	}
	
	


	public String getUsuario() {
		return usuario;
	}




	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

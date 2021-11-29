package logico;

public class Medico extends Usuario {

	private String codMedico;
	private String especialidad;
	
	
	public Medico(String codUsuario, String login, String idUsuario, String password, String nombre, String telefono,
			String codMedico, String especialidad) {
		super(codUsuario, login, idUsuario, password, nombre, telefono);
		this.codMedico = codMedico;
		this.especialidad = especialidad;
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

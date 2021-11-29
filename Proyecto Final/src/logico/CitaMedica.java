package logico;

import java.util.Date;

public class CitaMedica {

	private String codCita;
	private String nombrePersona;
	private String telefonoPersona;
	private Date fechaCita;
	private Medico medico;
	
	
	public CitaMedica(String codCita, String nombrePersona, String telefonoPersona, Date fechaCita, Medico medico) {
		super();
		this.codCita = codCita;
		this.nombrePersona = nombrePersona;
		this.telefonoPersona = telefonoPersona;
		this.fechaCita = fechaCita;
		this.medico = medico;
	}

	public String getCodCita() {
		return codCita;
	}

	public void setCodCita(String codCita) {
		this.codCita = codCita;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	

}


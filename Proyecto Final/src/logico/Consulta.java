package logico;

import java.io.Serializable;
import java.util.Date;

public class Consulta implements Serializable{

	private String codConsulta;
	private Date fechaConsulta;
	private String sintomas;
	private String diagnostico;
	private Enfermedad enfermedad;
	
	
	public Consulta(String codConsulta, Date fechaConsulta, String sintomas, String diagnostico,
			Enfermedad enfermedad) {
		super();
		this.codConsulta = codConsulta;
		this.fechaConsulta = fechaConsulta;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.enfermedad = enfermedad;
	}

	public String getCodConsulta() {
		return codConsulta;
	}

	public void setCodConsulta(String codConsulta) {
		this.codConsulta = codConsulta;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	

}


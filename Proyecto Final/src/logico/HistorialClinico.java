package logico;

import java.util.ArrayList;

public class HistorialClinico {

	private String codHistorial;
	private ArrayList<Consulta>misConsultas;
	private ArrayList<Vacuna>misVacunas;
	private ArrayList<Enfermedad>Enfermedades;
	
	
	public HistorialClinico(String codHistorial, ArrayList<Consulta> misConsultas, ArrayList<Vacuna> misVacunas, ArrayList<Enfermedad>Enfermedades) {
		super();
		this.codHistorial = codHistorial;
		this.misConsultas = misConsultas;
		this.misVacunas = misVacunas;
		this.Enfermedades= Enfermedades;
	}

	

	public String getCodHistorial() {
		return codHistorial;
	}


	public void setCodHistorial(String codHistorial) {
		this.codHistorial = codHistorial;
	}


	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}


	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}


	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}


	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}



	public ArrayList<Enfermedad> getEnfermedades() {
		return Enfermedades;
	}



	public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
		Enfermedades = enfermedades;
	}
	
	

}

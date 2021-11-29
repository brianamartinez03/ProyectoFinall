package logico;

import java.util.ArrayList;

public class HistorialClinico {

	private String codHistorial;
	private ArrayList<Consulta>misConsultas;
	private ArrayList<Vacuna>misVacunas;
	
	
	public HistorialClinico(String codHistorial, ArrayList<Consulta> misConsultas, ArrayList<Vacuna> misVacunas) {
		super();
		this.codHistorial = codHistorial;
		this.misConsultas = misConsultas;
		this.misVacunas = misVacunas;
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
	
	

}

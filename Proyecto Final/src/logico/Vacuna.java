package logico;

import java.io.Serializable;

public class Vacuna implements Serializable{

	private String codVacunacion;
	private String nombreVacuna;
	
	public Vacuna(String codVacunacion, String nombreVacuna) {
		super();
		this.codVacunacion = codVacunacion;
		this.nombreVacuna = nombreVacuna;
	}

	public String getCodVacunacion() {
		return codVacunacion;
	}

	public void setCodVacunacion(String codVacunacion) {
		this.codVacunacion = codVacunacion;
	}

	public String getNombreVacuna() {
		return nombreVacuna;
	}

	
	public void setNombreVacuna(String nombreVacuna) {
		this.nombreVacuna = nombreVacuna;
	}
	
	

}

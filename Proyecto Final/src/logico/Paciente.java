package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Paciente implements Serializable {

	private String cedula;
	private String nombre;
	private String genero;
	private String FechadeNacimiento;
	private String direccion;
	private String telefono;
	private ArrayList<HistorialClinico>mishistoriales;
	private ArrayList<Consulta>misConsultas;
	
	
	public Paciente() {}
	
	
	public Paciente(String cedula, String nombre, String genero, String FechadeNacimiento, String direccion,
			String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.genero = genero;
		this.FechadeNacimiento = FechadeNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.misConsultas = new ArrayList<Consulta>();
		this.mishistoriales = new ArrayList<HistorialClinico>();
	}

	

	public String getFechadeNacimiento() {
		return FechadeNacimiento;
	}



	public void setFechadeNacimiento(String fechadeNacimiento) {
		FechadeNacimiento = fechadeNacimiento;
	}



	public ArrayList<HistorialClinico> getMishistoriales() {
		return mishistoriales;
	}



	public void setMishistoriales(ArrayList<HistorialClinico> mishistoriales) {
		this.mishistoriales = mishistoriales;
	}



	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDiaNacimiento() {
		return FechadeNacimiento;
	}


	public void setDiaNacimiento(String diaNacimiento) {
		this.FechadeNacimiento = diaNacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}


	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}
	
	
}


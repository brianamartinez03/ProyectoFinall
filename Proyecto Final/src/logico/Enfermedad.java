package logico;

public class Enfermedad {

	private String codEnfermedad;
	private String nombreEnfermedad;
	private String tipoEnfermedad;
	private String descripcionEnfermadad;
	
	
	
	public Enfermedad(String codEnfermedad, String nombreEnfermedad, String tipoEnfermedad,
			String descripcionEnfermadad) {
		super();
		this.codEnfermedad = codEnfermedad;
		this.nombreEnfermedad = nombreEnfermedad;
		this.tipoEnfermedad = tipoEnfermedad;
		this.descripcionEnfermadad = descripcionEnfermadad;
	}


	public String getCodEnfermedad() {
		return codEnfermedad;
	}


	public void setCodEnfermedad(String codEnfermedad) {
		this.codEnfermedad = codEnfermedad;
	}


	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}


	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}


	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}


	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}


	public String getDescripcionEnfermadad() {
		return descripcionEnfermadad;
	}


	public void setDescripcionEnfermadad(String descripcionEnfermadad) {
		this.descripcionEnfermadad = descripcionEnfermadad;
	}
	
	
	

}

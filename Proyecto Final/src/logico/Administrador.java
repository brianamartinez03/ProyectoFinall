package logico;

public class Administrador extends Usuario {

	
	private String puestoLaboral;

	

	public Administrador(String codUsuario, String idUsuario, String nombre, String telefono, String puestoLaboral) {
		super(codUsuario, idUsuario, nombre, telefono);
		this.puestoLaboral = puestoLaboral;
	}

	public String getPuestoLaboral() {
		return puestoLaboral;
	}

	public void setPuestoLaboral(String puestoLaboral) {
		this.puestoLaboral = puestoLaboral;
	}
	
	

}

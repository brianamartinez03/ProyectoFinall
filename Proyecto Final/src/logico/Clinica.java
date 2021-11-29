package logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Paciente>Pacientes;
	private ArrayList<Usuario>Usuarios;
	private ArrayList<CitaMedica>citasMedicas;
	private ArrayList<Enfermedad>Enfermedades;
	private ArrayList<Vacuna>Vacunas;
	public static Clinica clinica = null;
	private int cantpacientes=0;
	private int cantcitas=0;

	
	
	
	public Clinica() {
		super();
		this.Pacientes = new ArrayList<Paciente>();
		this.Usuarios = new ArrayList<Usuario>();
		this.citasMedicas = new ArrayList<CitaMedica>();
		this.Enfermedades = new ArrayList<Enfermedad>();
		this.Vacunas = new ArrayList<Vacuna>();
	}

	public static Clinica getInstance() {
		if (clinica == null) {
			clinica = new Clinica();
		}
		return clinica;
	}

	public ArrayList<Paciente> getMisPacientes() {
		return Pacientes;
	}


	public void setMisPacientes(ArrayList<Paciente> misPacientes) {
		this.Pacientes = misPacientes;
	}


	public ArrayList<Usuario> getMisUsuarios() {
		return Usuarios;
	}


	public void setMisUsuarios(ArrayList<Usuario> misUsuarios) {
		this.Usuarios = misUsuarios;
	}


	public ArrayList<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}


	public void setCitasMedicas(ArrayList<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}


	public ArrayList<Enfermedad> getMisEnfermedades() {
		return Enfermedades;
	}


	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.Enfermedades = misEnfermedades;
	}


	public ArrayList<Vacuna> getMisVacunas() {
		return Vacunas;
	}


	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.Vacunas = misVacunas;
	}
	
	/*public void insertarVino(Vino v1, Suministrador s1) {
		misVinos[cantRealVino] = v1;
		cantRealVino++;
		s1.isertVino(v1);
		miSumi[cantRealSum]=s1;
		cantRealSum++;
	*/
	
	public void insertarPaciente(Paciente paciente) {
		Pacientes.add(paciente);
	}

	public void insertarCitaMedica(CitaMedica citasmedicas) {
		citasMedicas.add(citasmedicas);
	}
	
	public void insertarEnfermedad(Enfermedad enfermedad) {
		Enfermedades.add(enfermedad);
	}
	
	public void insertarUsuario(Usuario usuario) {
		Usuarios.add(usuario);
	}	
	
	public void insertarVacuna(Vacuna vacuna) {
		Vacunas.add(vacuna);
	}
	
	/*public Componente obtenerComponente(String NumSerie) {
		Componente comp = null;
		boolean encontrado = false;
		int i = 0;
		while (i < misComps.size() && !encontrado) {
			if (misComps.get(i).getNumSerie().equalsIgnoreCase(NumSerie)) {
				comp = misComps.get(i);
				encontrado = true;
			}
			i++;
		}
		return comp;
	}*/
	
	public Paciente BuscarPaciente(String id) {
		boolean encontrado = false;
		Paciente paciente = null;
		int i =0;
		while(i <Pacientes.size() && !encontrado) {
			if(Pacientes.get(i).getCedula().equalsIgnoreCase(id)) {
				paciente = Pacientes.get(i);
				encontrado = true;
			}
			i++;
		}
		return paciente;
	}
	
	public CitaMedica BuscarCitaMedica(String id) {
		boolean encontrado = false;
		CitaMedica citamedica = null;
		int i =0;
		while(i<citasMedicas.size() && !encontrado) {
			if(citasMedicas.get(i).getCodCita().equalsIgnoreCase(id)) {
				citamedica = citasMedicas.get(i);
				encontrado =true;
;			}
			i++;
		}
		return citamedica;
	}
	
	public Enfermedad BuscarEnfermedad(String id) {
		boolean encontrado = false;
		Enfermedad enfermedad = null;
		int i = 0;
		while(i<Enfermedades.size() && !encontrado) {
			if(Enfermedades.get(i).getCodEnfermedad().equalsIgnoreCase(id)) {
				enfermedad = Enfermedades.get(i);
				encontrado =true;
			}
			i++;
		}
		return enfermedad;
	}
	
	public Usuario BuscarUsuario(String id) {
		boolean encontrado = false;
		Usuario usuario = null;
		int i = 0;
		while(i<Usuarios.size() && !encontrado) {
			if(Usuarios.get(i).getCodUsuario().equalsIgnoreCase(id)){
				usuario = Usuarios.get(i);
				encontrado =true;
			}
			i++;
		}
		return usuario;
	}
	
	public Vacuna BuscarVacuna(String id) {
		boolean encontrado = false;
		Vacuna vacuna = null;
		int i = 0;
		while(i<Vacunas.size() && !encontrado) {
			if(Vacunas.get(i).getCodVacunacion().equalsIgnoreCase(id)){
				vacuna = Vacunas.get(i);
				encontrado =true;
			}
			i++;
		}
		return vacuna;
	}
}


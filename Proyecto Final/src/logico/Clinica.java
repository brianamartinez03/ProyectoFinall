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
	private int cantmedicos=0;
	private int cantvacunas=0;
	private int cantenfermedades=0;
	private int cantusuarios=0;

	
	
	
	
	public Clinica() {
		super();
		this.Pacientes = new ArrayList<Paciente>();
		this.Usuarios = new ArrayList<Usuario>();
		this.citasMedicas = new ArrayList<CitaMedica>();
		this.Enfermedades = new ArrayList<Enfermedad>();
		this.Vacunas = new ArrayList<Vacuna>();
		this.cantcitas=0;
		this.cantmedicos=0;
		this.cantvacunas=0;
		this.cantenfermedades=0;
		this.cantusuarios=0;
	}

	public static Clinica getInstance() {
		if (clinica == null) {
			clinica = new Clinica();
		}
		return clinica;
	}
	
	public static void setClinica(Clinica clinica) {
		Clinica.clinica = clinica;
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
	
	public boolean insertarPaciente(Paciente paciente) {
		boolean hecho = false;
		if (paciente != null) {
			Pacientes.add(paciente);
			System.out.println("Paciente Añadido");
			setCantpacientes(getCantpacientes() + 1);
			hecho = true;

		}
		System.out.println(hecho);
		return hecho;
	}
	
	
	public boolean insertarCitaMedica(CitaMedica citamedica) {
		boolean hecho = false;
		if (citamedica != null) {
			citasMedicas.add(citamedica);
			System.out.println("Cita Añadida");
			cantcitas++;
			hecho = true;

		}
		System.out.println(hecho);
		return hecho;
	}
	
	public boolean insertarEnfermedad(Enfermedad enfermedad) {
		boolean hecho = false;
		if (enfermedad != null) {
			Enfermedades.add(enfermedad);
			System.out.println("Enfermedad Añadida");
			cantenfermedades++;
			hecho = true;

		}
		System.out.println(hecho);
		return hecho;
	}
	
	public boolean insertarUsuario(Usuario usuario) {
		boolean hecho = false;
		if (usuario != null) {
			Usuarios.add(usuario);
			System.out.println("Usuario Añadido");
			cantusuarios++;
			hecho = true;

		}
		System.out.println(hecho);
		return hecho;
	}
	
	public boolean insertarVacuna(Vacuna vacuna) {
		boolean hecho = false;
		if (vacuna != null) {
			Vacunas.add(vacuna);
			System.out.println("Vacuna Añadida");
			cantvacunas++;
			hecho = true;

		}
		System.out.println(hecho);
		return hecho;
	}
	
	public boolean deletePaciente(Paciente paciente) {
		System.out.println("eliminar paciente");
		if (paciente != null) {
			Pacientes.remove(paciente);
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return true;

	}

	
	
	public boolean deleteCitaMedica(CitaMedica citamedica) {
		System.out.println("eliminar cita medica");
		if (citamedica != null) {
			citasMedicas.remove(citamedica);
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return true;

	}
	
	public boolean deleteUsuario(Usuario usuario) {
		System.out.println("eliminar usuario");
		if (usuario != null) {
			Usuarios.remove(usuario);
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return true;

	}
	
	public boolean deleteVacuna(Vacuna vacuna) {
		System.out.println("eliminar vacuna");
		if (vacuna != null) {
			Vacunas.remove(vacuna);
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return true;

	}

	public int getCantpacientes() {
		return cantpacientes;
	}

	public void setCantpacientes(int cantpacientes) {
		this.cantpacientes = cantpacientes;
	}

	public int getCantcitas() {
		return cantcitas;
	}

	public void setCantcitas(int cantcitas) {
		this.cantcitas = cantcitas;
	}

	public int getCantmedicos() {
		return cantmedicos;
	}

	public void setCantmedicos(int cantmedicos) {
		this.cantmedicos = cantmedicos;
	}

	public int getCantvacunas() {
		return cantvacunas;
	}

	public void setCantvacunas(int cantvacunas) {
		this.cantvacunas = cantvacunas;
	}

	public int getCantenfermedades() {
		return cantenfermedades;
	}

	public void setCantenfermedades(int cantenfermedades) {
		this.cantenfermedades = cantenfermedades;
	}

	public int getCantusuarios() {
		return cantusuarios;
	}

	public void setCantusuarios(int cantusuarios) {
		this.cantusuarios = cantusuarios;
	}
	
	
	
}


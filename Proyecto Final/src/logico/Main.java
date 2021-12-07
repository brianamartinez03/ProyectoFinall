package logico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clinica clinica = new Clinica();
		
		Paciente paciente = new Paciente();
		paciente.setCedula("034-2324242-4");
		paciente.setNombre("Lenin");
		paciente.setDiaNacimiento("09/04/99");
		
		clinica.insertarPaciente(paciente);
		

	}

}

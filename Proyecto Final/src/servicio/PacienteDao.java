/*package servicio;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import servicio.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

import logico.Paciente;

public class PacienteDao implements Dao <Paciente> {
	
	@Override
	public void guardar(Paciente entidad) throws SQLException{
		Connection conexion = Conexion.getInstance().getConexionDb();
		PreparedStatement p = conexion.prepareStatement("INSERT INTO paciente( cedula, nombre, genero, fecha, direccion,telefono) VALUES (?,?,?,?,?,?);");
		p.setString(1, entidad.getCedula());
		p.setString(2, entidad.getNombre());
		p.setString(3, entidad.getGenero());
		p.setString(4, entidad.getCedula());
		p.setString(5, entidad.getFechadeNacimiento());
		p.setString(6, entidad.getDireccion());
		p.setString(7, entidad.getTelefono());
		
		p.execute();
		p.close();
		conexion.close();
	}
	
	@Override
	public void actualizar(Paciente entidad) throws SQLException{
		
	}
	@Override
	public void borrar(Paciente entidad) throws SQLException{
		
	}
	@Override
	public ArrayList <Paciente> buscar(Paciente entidad) throws SQLException{
		ArrayList<Paciente> pacientes = new ArrayList<>(); 

        Connection conexion = Conexion.getInstance().getConexionDb();
        PreparedStatement p = conexion.prepareStatement("SELECT * FROM paciente");
        ResultSet r = p.executeQuery();
        while (r.next()) {
            Paciente paciente = parse(r);
            pacientes.add(paciente);
        }

        return pacientes;
        
		
	}
	
	public Paciente parse(ResultSet r) {
		
		Paciente p = new Paciente();
		p.setCedula(r.getString("cedula")));
		p.setNombre(r.getString("nombre"));
		p.setTelefono(r.getString("telefono"));
		p.setDireccion(r.getString("direccion"));
		p.setGenero(r.getString("genero"));
		p.setDiaNacimiento(r.getString("dianacimiento"));
	
		return p;
		
	}
	

}*/

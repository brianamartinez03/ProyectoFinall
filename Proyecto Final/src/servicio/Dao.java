package servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Dao <T> {
	
	public void guardar(T entidad) throws SQLException;
	public void actualizar(T entidad) throws SQLException;
	public void borrar(T entidad) throws SQLException;
	public ArrayList <T> buscar(T entidad) throws SQLException;
	public T parse(ResultSet r) throws SQLException;
	

}

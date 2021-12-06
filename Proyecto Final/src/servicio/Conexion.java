package servicio;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Conexion {
	
	private Connection conexionDb;
	private static Conexion miConexion;
/*
	private Conexion() {
	        try {
	            Properties properties = new Properties();
	            properties.load(new FileInputStream(""));
	            String usuario = properties.getProperty("");
	            String password = properties.getProperty("");
	            String url = properties.getProperty("");
	            conexionDb = DriverManager.getConnection();
	        } catch(SQLException | IOException e) {
	            e.printStackTrace();
	        }
	    }
*/
	public Connection getConexionDb() {
	        return conexionDb;
	    }

	public static Conexion getInstance() throws SQLException {
	        if(miConexion == null) {
	            miConexion = new Conexion();
	        } /*else if(miConexion.conexionDb.isClosed()) {
	            miConexion = new Conexion();
	        }*/
	        return miConexion;
	    }

}

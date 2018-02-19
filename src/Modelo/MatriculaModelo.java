package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MatriculaModelo extends Conector {

	/**
	 * Creamos la opcion de crear una matricula
	 * @param matricula
	 */
	public void insert (Matricula matricula){
		
	}
	
	/**
	 * Creamos la opción de actualizar una matricula
	 * @param matricula
	 */
	public void update (Matricula matricula){
		
	}
	
	/**
	 * Creamos la opción de borrar una matricula
	 * @param matricula
	 */
	public void delete (Matricula matricula){
		
	}

	public ArrayList<Matricula> selectAll() {
		
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from matriculas");
			while(rs.next()){
				Alumno alumno = new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setDni(rs.getString("dni"));
				alumno.setNombre(rs.getString("nombre"));
				alumno.setEmail(rs.getString("email"));
				
			   
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}
}

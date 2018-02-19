package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AsignaturaModelo extends Conector{

	/**
	 * Creamos la opción de insertar asignatura
	 * @param asignatura
	 */
	public void insert (Asignatura asignatura){
		
	}
	/**
	 * Creamos la opción de actualizar la asignatura
	 * @param asignatura
	 */
	public void update (Asignatura asignatura){
		
	}
	/**
	 * Creamos la opción de borrar la asignatura
	 * @param asignatura
	 */
	public void delete (Asignatura asignatura){
		
	}
	
	public ArrayList<Asignatura>SelectAll(){
		
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		
		
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from asignaturas");
			while(rs.next()){
				Asignatura asignatura = new Asignatura();
				
				asignatura.setId(rs.getInt("id"));
				asignatura.setNombre(rs.getString("nombre"));
				asignatura.setHoras(rs.getInt("horas"));
				
			}
			return asignaturas;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return asignaturas;
		
	}
	
}

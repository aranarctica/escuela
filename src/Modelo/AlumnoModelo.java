package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlumnoModelo extends Conector {
	/**
	 * Creamos la opción de insertar alumno
	 * 
	 * @param alumno
	 */

	public void insert(Alumno alumno) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("INSERT INTO alumnos (dni, nombre, email ) values (?,?,?)");
			pst.setString(1, alumno.getDni());
			pst.setString(2, alumno.getNombre());
			pst.setString(3, alumno.getEmail());
			
			pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creamos la opción de actualizar alumno
	 * 
	 * @param alumno
	 */

	public void update(Alumno alumno) {
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement("update alumnos set dni='?', nombre='?'; email='?' where id=");
			
			pst.setString(1, alumno.getDni());
			pst.setString(2, alumno.getNombre());
			pst.setString(3, alumno.getEmail());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Creamos la opción de eliminar alumon
	 * 
	 * @param alumno
	 */

	public void delete(Alumno alumno) {

	}

}

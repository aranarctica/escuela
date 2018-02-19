package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;


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
	
	
	public  ArrayList<Alumno> SelectAll(){
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from alumno");
			while(rs.next()){
				Alumno alumno = new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setDni(rs.getString("dni"));
				alumno.setEmail(rs.getString("email"));
				alumno.setNombre(rs.getString("nombre"));
				
				alumnos.add(alumno);
		    
			}
			return alumnos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alumnos;
		
		
	}
	public void mostrarAlumnos (ArrayList<Alumno> alumnos){
		Iterator<Alumno> i = alumnos.iterator();
		while(i.hasNext()){
			Alumno alumno = i.next();
			this.mostrarAlumnos(alumnos);
		}
	}

	public Alumno select(int id){
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from usuarios where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Alumno alumno= new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setNombre(rs.getString("nombre"));
				alumno.setDni(rs.getString("dni"));
				alumno.setEmail(rs.getString("email"));
				
				return alumno;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

		
		}

package Modelo;
/**
 * Creamos la clase Alumno y le definimos sus atributos
 * @author ik012982i9
 *
 */

public class Alumno {

	private int id;
	private String dni;
	private String nombre;
	private String email;
	
	/**
	 * Generamos los getters y setters
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

package Modelo;
/**
 * Creamos la clase Asignatura y le definimos sus atributos
 * @author ik012982i9
 *
 */

public class Asignatura {
	
	private int id;
	private String nombre;
	private int horas;
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

}

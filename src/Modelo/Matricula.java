package Modelo;
/**
 * Creamos la clase Matricula y le definimos sus atributos
 *  @author ik012982i9
 */
import java.sql.Date;

public class Matricula {
	
	
	private int idAlumno;
	private int idAsignatura;
	private Date fecha;
	
	/**
	 * Generamos los getters y setters
	 * @return
	 */
	
	public int getId_alumno() {
		return idAlumno;
	}
	public void setId_alumno(int id_alumno) {
		this.idAlumno = id_alumno;
	}
	public int getId_asignatura() {
		return idAsignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.idAsignatura = id_asignatura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}

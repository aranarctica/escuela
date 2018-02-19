package Vista;

import java.util.Scanner;

public class MenuGeneral {

	static final int GESTIONAR_ALUMNOS = 1;
	static final int GESTIONAR_ASIGNATURAS = 2;
	static final int GESTIONAR_MATRICULAS = 3;
	static final int SALIR = 0;
	
	public void menuGeneral(){
		AlumnoVista alumnoVista = new AlumnoVista();
		AsignaturaVista asignaturaVista = new AsignaturaVista();
		MatriculaVista matriculaVista = new MatriculaVista();
		
		int opcion;
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("------ESCUELA------");
			System.out.println(GESTIONAR_ALUMNOS + " Gestionar Alumnos");
			System.out.println(GESTIONAR_ASIGNATURAS + " Gestionas Asignaturas");
			System.out.println(GESTIONAR_MATRICULAS + " Gestionar Matriculas");
			System.out.println(SALIR + "Salir");
			
			opcion = Integer.parseInt(scan.nextLine());
			switch(opcion){
			
			case GESTIONAR_ALUMNOS:
			
			break;
			case GESTIONAR_ASIGNATURAS:
			
			break;
			case GESTIONAR_MATRICULAS:
			
			break;
			default:
				break;
			}
		
		
		
		
		}
	}
		
	
	
	


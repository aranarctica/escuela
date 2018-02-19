package Vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Modelo.Alumno;
import Modelo.AlumnoModelo;
import Modelo.AsignaturaModelo;
import Modelo.Matricula;
import Modelo.MatriculaModelo;

public class MatriculaVista {

	
//	static final int LISTAR = 1;
//	static final int SALIR = 0;
//	public void menuMatriculas(){
//		
////		Scanner scan = new Scanner (System.in);
//		
//		int opcion;
//		do{
//			
//			System.out.println("--Menu de matriculas--");
//			System.out.println(LISTAR + " - listar");
//			opcion = Integer.parseInt(scan.nextLine());
//			
//			switch(opcion){
//			case LISTAR:
//				MatriculaModelo matriculaModelo = new MatriculaModelo();
////			
//		}
//			
//			
//		
////		{
////			
////		}
////	
//	
//		
//		
//		
//		
//	}
	
		public void mostrarMatriculas(ArrayList<Matricula> matriculas){
			Iterator<Matricula> i = matriculas.iterator();
			while(i.hasNext()){
				Matricula matricula = i.next();
				mostrarMatricula(matricula);
			}
		}

private void mostrarMatricula(Matricula matricula) {

}
		
	}


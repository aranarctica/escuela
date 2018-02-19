package Modelo;

import java.util.ArrayList;

public class MainMatriculas extends Conector {

	public static void main(String[] args) {
		
		MatriculaModelo matriculaModelo = new MatriculaModelo();
		ArrayList<Matricula> matriculas = matriculaModelo.selectAll();
		
		

	}

}
package Modelo;

import java.sql.Connection;

public class Conector {

	protected Connection conexion;
	
	Conector(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

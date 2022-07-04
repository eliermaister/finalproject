package Auxiliar;

import java.util.ArrayList;

import logica.Sector;
import logica.Usuario;

public class Inicializador {
	public static Usuario inicializarUsuario(){		
		return new Usuario("user", "1234");
	}
	
	
	public static ArrayList<Sector> inicializarSectores(){
		ArrayList<Sector> sectores = new ArrayList<Sector>();
			
		sectores.add(new Sector(0, "Turismo"));
		sectores.add(new Sector(1, "Salud"));
		sectores.add(new Sector(2, "Educación"));
		
		
		return sectores;
	}
	
	
	
}

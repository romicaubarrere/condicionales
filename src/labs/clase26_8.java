package labs;

public class clase26_8 {

	public static void main(String[] args) {
		
	//variable mayor a 0, menor a 0 o = 0 practicando condicionales
		
		int var = 3;
		
		/* ejemplo if
		
		if (var < 0) { //lo que esta adentro de los parentesis siempre esta evaluado en true o false
			
			System.out.println("Es menor a 0");
			
		} if (var == 0) {
			System.out.println("Es igual a 0");
		} if (var > 0) {
			System.out.println("Es mayor a 0");
		}
		
			
			System.out.println("Fin del programa");
		}
		
		
		
		 // EJEMPLO IFELSE
		
		
			if (var < 0) { 
			System.out.println("Es menor a 0");	
		} else if (var == 0) { //elseif me facilita cuando anido muchos if uno adentro del otro, me queda mas claro
				System.out.println("Es igual a 0");
		} else {	
			System.out.println("Es mayor a 0");	
		}
			System.out.println("Fin del programa");
		}
	
		
		
		
	// PARA RANGOS
		
		if (var>= 0 && var <= 10) {
			System.out.println( "Esta entre 0 y 10");
		} else {
			System.out.println( "No esta en el rango");
		}
		*/
		
		// SWITCH: CASOS FIJOS, QUE LAS VARIABLES TENGAN UN VALOR FIJO
		
		switch (var) {// entre parentesis se pone el nombre de la variable, no condiciones
			case 1: // si la variable fuese un string debe llevar "hola" por ej
				System.out.println("Opcion 1");
			break; //nos hace salir de la sentencia
			case 2:
				System.out.println("Opcion 2");
			break;
			case 3:
				System.out.println("Opcion 3");
			break;
			default: 
				System.out.println("Ninguna de las anteriores");
			break; //podria no ponerle un break, no es obligatorio
		
		}
		
	}
}
	




public class Ejercicio2 {
	
	public static void main (String[] args) {
		//debe haber mínimo tres: nombre apellido1 apellido2
		//en caso contrario terminanos el programa: Error
		if (args.length < 3) {
			System.out.println("Faltan datos");
			return;
		}
		String nombre    = args[0];
		String apellido1 = args[1];
		String apellido2 = args[2];
		
		System.out.printf("\"%s %s %s\"%n", nombre, apellido1, apellido2);
	}
}


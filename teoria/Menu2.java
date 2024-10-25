public class Menu2 {
	
	public static void main (String[] args) {
		String menu = """   
				1) Sumar los dos valores
				2) Restar los dos valores
				3) Multiplicar los dos valores
				4) Didivir los dos valores
				5) Salir
				Elige opción [1-5]
			""";  //cadena multilínea
			
			
		int opcion = -1;
		do {	
			System.out.println(menu);
			opcion = (int) (Math.random() * 10 + 1);
			System.out.println("Opción elegida: " + opcion);
		
			switch (opcion) {
				case 1  -> System.out.println("Sumando los dos valores");
				case 2  -> System.out.println("Restando los dos valores");
				case 3  -> System.out.println("Multiplicando los dos valores");
				case 4  -> System.out.println("Dividiendo los dos valores");  
				case 5  -> { System.out.println("Saliendo");
						   System.out.println("Goodbye!"); }
				default -> System.out.println("Opción no permitida");
			}
		} while ( opcion < 1 || opcion > 5);
		System.out.println("fin de programa");
		
	}
}


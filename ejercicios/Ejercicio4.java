
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer número (comprendido entre 1-10)");
		int numero1 = sc.nextInt();
		System.out.println("Introduce segundo número (comprendido entre 1-10)");
		int numero2 = sc.nextInt();
		if ( numero1 < 1 || numero1 > 10 || numero2 < 1 || numero2 > 10) {
			System.out.printf("Los valores %d y %d no pueden ser procesados\n", numero1, numero2);
			return;
		}
		
		String menu = """
		    
			1) Sumar los dos valores
			2) Restar los dos valores
			3) Multiplicar los dos valores
			4) Didivir los dos valores
			5) Salir
			Elige opción [1-5]
			
			""";
		
		int opcion = 0;
		do {
			System.out.println(menu);
			opcion = sc.nextInt();
		} while (opcion != 5);
		
		
	}
}


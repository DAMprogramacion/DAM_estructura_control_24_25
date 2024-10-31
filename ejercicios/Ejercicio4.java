
import java.util.Scanner;

public class Ejercicio4 {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int obtenerNumero() {
		int numero = 0;
		do {
			System.out.println("Introduce número (comprendido entre 1-10)");
			numero = sc.nextInt();
		} while (numero < 1 || numero > 10);
		System.out.printf("%d valor correcto%n", numero);
		return  numero;

	}
	
	public static void main (String[] args) {
	
		/*int numero1 = 0, numero2 = 0;
		do {
			System.out.println("Introduce número (comprendido entre 1-10)");
			numero1 = sc.nextInt();
		} while (numero1 < 1 || numero1 > 10);
		System.out.printf("%d correcto%n", numero1);
		do {
			System.out.println("Introduce número (comprendido entre 1-10)");
			numero2 = sc.nextInt();
		} while (numero2 < 1 || numero2 > 10);
		System.out.printf("%d correcto%n", numero2);*/
		
		int numero1 = obtenerNumero();
		int numero2 = obtenerNumero();

		
		//cambiamos las especificaciones del programa, ahora solicitamos el nº tantas veces
		//que sea necesario hasta que ambos nº estén comprendidos entre 1-10
		/*if ( numero1 < 1 || numero1 > 10 || numero2 < 1 || numero2 > 10) {
			System.out.printf("Los valores %d y %d no pueden ser procesados\n", numero1, numero2);
			return;
		}*/
		
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
			switch(opcion) {
				case 1 -> {
					int suma = sumarDosNumeros(numero1, numero2);
					System.out.printf("%d + %d = %d\n", numero1, numero2, suma);
				}
				case 2 -> {
					int resta = restarDosNumeros(numero1, numero2);
					System.out.printf("%d - %d = %d\n", numero1, numero2, resta);
				}
				case 3 -> {
					int mult = multiplicarDosNumeros(numero1, numero2);
					System.out.printf("%d x %d = %d\n", numero1, numero2, mult);
				}
				case 4 -> {
					double div = dividirDosNumeros(numero1, numero2);
					System.out.printf("%d / %d = %.2f\n", numero1, numero2, div);
				}
				case 5 -> {
					System.out.println("Goodbye!!!");
					sc.close();  //cerramos el scanner
				}
				default -> System.out.println("Opción no permitida");
			}
		} while (opcion != 5);
	}
	
	
	
	private static int sumarDosNumeros(int a, int b) {
		return a + b;
	}
	private static int restarDosNumeros(int a, int b) {
		return a - b;
	}
	private static int multiplicarDosNumeros(int a, int b) {
		return a * b;
	}
	private static double dividirDosNumeros(int a, int b) {
		return 1.0 * a / b;
	}
	
	
	
	
	
}


import java.util.Scanner;

public class Ecuaciones {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static float calcularX(int a, int b, int c, int d, int e, int f) {
		return 1.0f * (e * d - b * f) / (a * d - b * c);
	}
	
	public static float calcularY(int a, int b, int c, int d, int e, int f) {
		return 1.0f * (a * f - e * c) / (a * d - b * c);
	}
	
	public static boolean esResoluble(int a, int b, int c, int d) {
		return a * d - b * c != 0;
	}
	
	public static void mostrarEcuacion(int a, int b, int c, int d, int e, int f) {
		//VAMOS A RESOLVER EL SIGUIENTE SISTEMAS DE DOS ECUACION Y DOS INCÓGNITAS:
		// Ecuación 1: 3x  + 5y   = 15
		// Ecuación 2: -5x  + -5y  = 1
		//usamos un printf
		System.out.println("VAMOS A RESOLVER EL SIGUIENTE SISTEMAS DE DOS ECUACION Y DOS INCÓGNITAS:");
		System.out.printf("Ecuación 1: %dx  + %dy   = %d\n", a, b, e);
		System.out.printf("Ecuación 2: %dx  + %dy   = %d\n", c, d, f);
	}

	public static int solicitarCoeficiente() {
		System.out.println("Dame un valor para un coeficiente de la ecuación");
		int coeficiente = sc.nextInt();
		return coeficiente;
	}
}


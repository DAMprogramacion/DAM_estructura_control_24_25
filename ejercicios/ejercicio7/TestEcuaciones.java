import java.util.Scanner;

public class TestEcuaciones {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		//método que nos solicite los seis coeficientes (a, b, c, d, e, f)
		int a = solicitarCoeficiente();
		int b = solicitarCoeficiente();
		int c = solicitarCoeficiente();
		int d = solicitarCoeficiente();
		int e = solicitarCoeficiente();
		int f = solicitarCoeficiente();
		//vamos a mostrar en consola el sistema de ecuaciones a resolver:
		mostrarEcuacion(a, b, c, d, e, f);
		boolean resoluble = esResoluble(a, b, c, d);
		//System.out.println(resoluble);
		//si es resoluble decimos que "se resuelve"
		//en caso contrario indicamos "No es resoluble la ecuación"
		if (resoluble) {
			//System.out.println("se resuelve");
			float x = calcularX(a, b, c, d, e, f);
			float y = calcularY(a, b, c, d, e, f);
			System.out.println("Ecuación resoluble, soluciones:");
			System.out.printf("x = %.2f%n", x);
			System.out.printf("y = %.2f%n", y);
		} else 
			System.out.println("No es resoluble la ecuación");
		sc.close();  //cerramos el Scanner
	}
	
	private static float calcularX(int a, int b, int c, int d, int e, int f) {
		return 1.0f * (e * d - b * f) / (a * d - b * c);
	}
	
	private static float calcularY(int a, int b, int c, int d, int e, int f) {
		return 1.0f * (a * f - e * c) / (a * d - b * c);
	}
	
	
	private static boolean esResoluble(int a, int b, int c, int d) {
		
		return a * d - b * c != 0;
	}
	
	
	private static void mostrarEcuacion(int a, int b, int c, int d, int e, int f) {
		//VAMOS A RESOLVER EL SIGUIENTE SISTEMAS DE DOS ECUACION Y DOS INCÓGNITAS:
		// Ecuación 1: 3x  + 5y   = 15
		// Ecuación 2: -5x  + -5y  = 1
		//usamos un printf
		System.out.println("VAMOS A RESOLVER EL SIGUIENTE SISTEMAS DE DOS ECUACION Y DOS INCÓGNITAS:");
		System.out.printf("Ecuación 1: %dx  + %dy   = %d\n", a, b, e);
		System.out.printf("Ecuación 2: %dx  + %dy   = %d\n", c, d, f);
	}

	private static int solicitarCoeficiente() {
		System.out.println("Dame un valor para un coeficiente de la ecuación");
		int coeficiente = sc.nextInt();
		return coeficiente;
	}
}


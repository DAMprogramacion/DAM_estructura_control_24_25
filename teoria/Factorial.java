/*
 * Programa factorial: 
 * n = 0 factorial 1
 * n = 1 factorial 1
 * n = 2 factorial 1 * 2
 * .....
 * n = 5 factorial 1 * 2 * 3 * 4 * 5
 * .................
 * //máximo 20
 */


public class Factorial {
	
	public static void main (String[] args) {
		
		int numero = 20;
		//el programa no debe computar las sentencias abajo
		//si numero es negativo o mayor que 20
		if ( numero < 0 || numero > 20 ) {
			System.out.println("Nº no válido para calcular el factorial");
			System.exit(1);
		}
		long factorial = 1;
		for (int i = 1; i <= numero ; i++) {
			factorial = factorial * i;  // factorial *= i;
		}
		System.out.println("El factorial de " + numero + " vale: " + factorial);
	}
}


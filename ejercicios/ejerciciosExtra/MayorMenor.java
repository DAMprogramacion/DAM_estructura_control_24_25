/*
 * Ejercicio 1:

   Defines dos variables enteras, y debes decir cual es el mayor y menor número, si son iguales también lo decimos, ejemplos:

   1 y 6: 6 es el mayor y 1 es el menor.
   5 y 5: ambos números son iguales.
 
 */


public class MayorMenor {
	
	public static void main (String[] args) {
		
		int x = 6, y = 6;

		if (x == y) {
			System.out.println(x + " y " + y + " son iguales");
			System.exit(0);
		}
		
		if (x > y) {
			System.out.println(x + " y " + y + ": " + x + " es el mayor y " + y + " es el menor");
		} else {
			System.out.println(x + " y " + y + ": " + y + " es el mayor y " + x + " es el menor");
		}
	}
}


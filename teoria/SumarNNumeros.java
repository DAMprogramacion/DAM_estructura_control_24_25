/*
 * Programa que dado n = 0, devuelve 0
 * si n = 1, devuelve 1
 * si n = 2, devuelve 1 + 2
 * si n = 3; devuelve 1 + 2 + 3
 */


public class SumarNNumeros {
	
	public static void main (String[] args) {
		int numero = 1_222; //define la operación: 0 + 1 + 2 + 3 + 4
		
		if (numero < 0) {
			System.out.println("Algoritmo no válido para nº negativos");
		} else {
		
			int suma = 0; //donde acumula la suma
			int contador = 0; //contador que va a variar: 0 1 2 3 4
		
			while (contador <= numero) {
				suma += contador; // suma = suma + contador
				contador++;
			}
			System.out.println("La suma de los " + numero + " primeros nº vale: " + suma);
		}
	}
}


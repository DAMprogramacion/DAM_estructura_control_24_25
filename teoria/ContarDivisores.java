/*
 * El programa introduce dos números determinados, ejemplo 56 y 5
 * Primero tenemos saber el mayor y el menor.
 * Porque vamos a recorrer los nº desde 1 al mayor, ejemplo 1, 2, 3, 4 .....50, 51 ... 55, 56
 * en principio mostramos cada nº en una única línea, una vez probado, comentamos el println
 * Mostramos los divisores comunes entre 1 y número mayor y el número menor 
 * buscamos 5, 10, 15, 20, 25, ....50 y 55 y lo mostramos en consola
 * .............
 * Ejemplo 10 es múltiplo de 5
 * ...........
 * Queremos un mensaje final, que nos diga el nº de mútiplo que hay:
 * Entre 1 y 56 hay 11 múltiplos de 5
 */


public class ContarDivisores {
	
	public static void main (String[] args) {
		int numero1 = 5;
		int numero2 = 56;
		
		//int numeroMayor = Math.max(numero1, numero2);
		//int numeroMenor = Math.min(numero1, numero2);
		
		int numeroMayor, numeroMenor;
		
		if (numero1 > numero2) {
			numeroMayor = numero1;
			numeroMenor = numero2;
		} else {
			numeroMayor = numero2;
			numeroMenor = numero1;
		}
			
		System.out.println("Mayor: " + numeroMayor + ", menor: " + numeroMenor);
		
		int contadorMultiplos = 0;
		/*for (int i = 1; i <= numeroMayor; i++) {
			
			//System.out.println(i);
			//int restoDivision = i % numeroMenor;
			//if ( restoDivision == 0 ) {
			if ( i % numeroMenor == 0 ) {
				System.out.println(i + " es múltiplo de " + numeroMenor);
				contadorMultiplos++;
			}
		}*/
		
		/*int contador = 1;
		while (contador <= numeroMayor) {
			if ( contador % numeroMenor == 0 ) {
				System.out.println(contador + " es múltiplo de " + numeroMenor);
				contadorMultiplos++;
			}
			contador++;
		}*/
		
		int contador = 1;
		do {
			if ( contador % numeroMenor == 0 ) {
				System.out.println(contador + " es múltiplo de " + numeroMenor);
				contadorMultiplos++;
			}
			contador++;
		} while (contador <= numeroMayor);
		
		System.out.println("Entre 1 y " + numeroMayor + " hay " + contadorMultiplos + " múltiplos de " + numeroMenor);
		
	}
}


/*
 * Vamos a buscar NO múltiplos de 2, 3 y 5, queremos solo la cantidad de NO múlt.
 * buscamos un aleatorio entre 1 y 10.000 
 * LÓGICA:
 * definimos un contador de no múltiplos
 * SI múltiplo de 2, 3 ó 5, no hacemos nada
 * NO usamos else, por lo que la sentencia siguiente sería aumentar el nº de
 * NO múltiplos 
 * Vamos a usar la sentencia continue, se queda en el bucle, pero no valora las s
 * sentencias de abajo
 */


public class NumeroNoMultiplos {
	
	public static void main (String[] args) {
		//declaramos e inicializamos un nº aleatorio entre 1 y 10.000
		//vamos a ver como funciona Math.random()
		/*for (int i = 0; i < 10; i++)
			System.out.println((int) (Math.random() * 10_000 + 1));*/
			
		int numero = (int) (Math.random() * 100 + 1);
		System.out.println("Buscando el nº de NO múltiplos de 2, 3 y 5 de " + numero + "....");
		//definimos un bucle que vaya desde 1 a numero
		int contadorNOMultiplos = 0;
		for (int i = 1; i <= numero; i++) {
			//System.out.print(i + "   ");
			//SI múltiplo de 2 ó 3 ó 5 indicamos i, despues cambiamos y no hacemos nada
			if ( i % 2 == 0 || i % 3 == 0 || i % 5 == 0 )
				continue; //las sentencias por debajo y dentro del bucle, NO se ejecutan
			//System.out.print(i + "   ");
			contadorNOMultiplos++;
		}
		System.out.println("Nº de NO múltiplos: " + contadorNOMultiplos);
	
	}
}


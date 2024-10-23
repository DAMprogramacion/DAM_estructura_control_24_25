

public class Divisores{
	
	public static void main (String[] args) {
		
		int numero = (int) (Math.random() * 1_000) + 1; //aleatorio entre 1 y 1000 inclusive
		System.out.println(numero + ": es el valor aleatorio");
		
		/*int numeroDivisores = numero / 10;  //buscamos una décima parte, ejemplo de 1000: 100, 125: 12
		//debe haber mínimo dos divisores, con la lógica anterior 3 ó 12 ó 8 no buscamos ninguno
		if (numero < 20)
		    numeroDivisores = 2;*/
		    
		int numeroMaxDivisores = 10;
		System.out.println("Buscando un máximo de divisores " + numeroMaxDivisores + " del nº " + numero);
		
		//fori
		//mostramos divisores y aumentamos el contadorDivisores
		//si alcanzamos la cifra de divisores a numeroDivisores, el programa no continua: break
		int contadorDivisores = 0;
		//boolean masDeDiezDivisores = false;
		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0) { //i divide a numero, por lo que es divisor
				contadorDivisores++;
				System.out.println(contadorDivisores + ".- " +  i + " es divisor de " + numero);
			}
			if (contadorDivisores == 10) {
				System.out.println("hemos llegado al tope de divisores");
				//masDeDiezDivisores = true;
				break;  //sale del bucle for
			}
			
			
		}
		//mostramos datos
		String mensaje = "";
		if (contadorDivisores <= 2)
			System.out.println(numero + " es nº primo");
		else if (contadorDivisores < 10)
			mensaje = "El nº " + numero + " tiene  " + contadorDivisores + " divisores";
		else
			mensaje = "El nº " + numero + " tiene como mínimo " + contadorDivisores + " divisores";
		
		System.out.println(mensaje);
		
	}
}


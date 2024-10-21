

public class Divisores{
	
	public static void main (String[] args) {
		
		int numero = (int) (Math.random() * 1_000) + 1; //aleatorio entre 1 y 1000 inclusive
		System.out.println(numero + ": es el valor aleatorio");
		
		int numeroDivisores = numero / 10;  //buscamos una décima parte, ejemplo de 1000: 100, 125: 12
		//debe haber mínimo dos divisores, con la lógica anterior 3 ó 12 ó 8 no buscamos ninguno
		if (numero < 20)
		    numeroDivisores = 2;
		System.out.println("Buscando un máximo de " + numeroDivisores + " del nº " + numero);
		
		//fori
		//mostramos divisores y aumentamos el contadorDivisores
		//si alcanzamos la cifra de divisores a numeroDivisores, el programa no continua: break
		
		//mostramos datos
		
	}
}


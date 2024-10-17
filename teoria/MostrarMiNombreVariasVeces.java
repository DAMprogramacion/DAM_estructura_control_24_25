public class MostrarMiNombreVariasVeces {
	
	public static void main (String[] args) {
		//bucle for
		System.out.println("====Bucle for=====");
		for (int i = 0; i < 7; i++ ) {
			System.out.println((i + 1) + ".- Manuel Molino");
		}
		//System.out.println("Valor de i: " + i); está en un ámbito interno
		
		//bucle while
		System.out.println("====Bucle while=====");
		int contador = 0;
		while (contador < 7) {
			++contador;
			System.out.println(contador + ".- Manuel Molino");
		}
		System.out.println("contador: " + contador);
		
		System.out.println("====Bucle while=====");
		contador = 0;
		while (contador < 7) {
			System.out.println(++contador + ".- Manuel Molino");
		}
		System.out.println("contador: " + contador);
		
		System.out.println("====Bucle do while=====");
		contador = 0;
		do {
			System.out.println((contador + 1) + ".- Manuel Molino");
			contador++;
		} while (contador < 7);
		
		
		
		
		
		
	}
}


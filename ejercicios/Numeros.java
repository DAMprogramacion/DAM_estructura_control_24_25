
import java.util.Random;

public class Numeros {
	
	public static void main (String[] args) {
				
		//Muestra en consola los números del 1 al 10, usando un bucle do while
		int contador = 1;
		do {
			System.out.println(contador++);
			//contador++;
		} while (contador <= 10);
		System.out.println("CONTADOR: " + contador + '\n');
		
		//Muestra en consola la siguiente serie: 20 25 30 35 . . . 70 75 80, usando un
		//bucle while
		
		contador = 20;
		while (contador <= 80) {
			System.out.println(contador);
			contador += 5;  // contador = contador + 5
		}
		System.out.println("CONTADOR: " + contador + '\n');
		
		//Muestra en consola la siguiente serie: 100 98 96 94 . . . 56 54 52 50, usa un
		//bucle for
		/*for (int i = 100; i >= 50 ; i -= 2) {   // i = i - 2
			System.out.println(i);
		}*/
		//System.out.println("CONTADOR: " + i + '\n');  No accedemos al contador i
		for (int i = 100; i >= 50 ; i -= 2)   // i = i - 2
			System.out.println(i);  //solo una línea, no hace falta {}
		
		//número generado aleatoriamente:
		int aleatorio = 1 + new Random().nextInt(10);
		System.out.println("\nALEATORIO: " + aleatorio);
		// en el caso de 4, muestra el cálculo de 1 * 2 * 3 * 4, en caso de 3: 1 * 2 * 3
		contador = 1;  //estaba en 85
		int multiplicacion = 1; //acumular las multiplicaciones
		do {
			multiplicacion *= contador;   //multiplicacion = multiplicacion * contador
			contador++;
		} while (contador <= aleatorio);
		System.out.println("El factorial de " + aleatorio  + " vale " + multiplicacion); 
		System.out.println("CONTADOR: " + contador + '\n');
		//idem con suma y cuadrados, pero ahora sería 1² + 2² + 3² + .......
		
		contador = 0;
		int suma = 0;
		while (contador <= aleatorio) {
			suma += contador * contador;
			contador++;
		} 
		System.out.println("La suma de cuadrados desde 1 a " + aleatorio  + " vale " + suma); 
		System.out.println("CONTADOR: " + contador + '\n');
		//¿Cómo se haría sin tener que resetear el contador: no hacer contador = 0;
		
		//sumar los pares e impares, desde 0 a aleatorio independientemente, 
		// Ejemplo 8: pares: 0 + 2 + 4 + 6 + 8 = 20
		// impares: 1 + 3 + 5 + 7 = 16
		//ejemplo salida:
		//La suma de los números pares desde 0 a 8 vale 20
		//La suma de los números impares desde 0 a 8 vale 16
		
		int sumaPares   = 0;
		int sumaImpares = 0; 
		for (int i = 0; i <= aleatorio; i++) {
			if (i % 2 == 0)
			    sumaPares += i;  //solo una sentencia
			else
				sumaImpares += i; //solo una sentencia
		}
		System.out.println("La suma de los números pares desde 0 a " + aleatorio + " vale " + sumaPares);
		System.out.println("La suma de los números impares desde 0 a " + aleatorio + " vale " + sumaImpares);
		
	}
}


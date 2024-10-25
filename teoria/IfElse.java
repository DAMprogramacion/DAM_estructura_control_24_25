import java.util.Random;

public class IfElse {
	
	public static void main (String[] args) {
		
		//bucle que se repita 100 veces 
		//en el bucle generamos un nº entero aleatorio entre 1 y 100
		//usando ? :  creamos mensaje si es par o impar
		//sout(mensaje)
		for (int i = 0; i < 100; i++) {
			int numero = new Random().nextInt(100) + 1;
			String mensaje = numero % 2 == 0 ? " es par" : " es impar";
			System.out.println(numero + mensaje);
		}
		
	}
}


/*
 * Programa que calcula el área de un círculo
 * Si el radio es cero o negativo, no hace
 * dicho cálculo, damos un mensaje y salimos
 * del programa con un código 1
 */


public class CalcularArea2 {
	
	public static void main (String[] args) {
		
		//defines el radio
		double radio = -50;
		
		//si el radio no es cero o negativo se hace el cálculo
		if (radio <= 0) {
			//dar un mensaje de que esos círculo de radio <= 0 no existan
			System.out.println("No existen círculos de radio: " + radio);
			//acabe el programa
			System.exit(1);
		}
		double area =  Math.PI * Math.pow(radio, 2);
		System.out.println("Un círculo de radio " + radio + " tiene de área: " + area);
		
	}
}


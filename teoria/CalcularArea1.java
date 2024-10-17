/*
 * Programa que calcula el área de un círculo
 * Si el radio es cero o negativo, no hace
 * dicho cálculo
 */


public class CalcularArea1 {
	
	public static void main (String[] args) {
		
		//defines el radio
		double radio = 50;
		
		//si el radio no es cero o negativo se hace el cálculo
		if (radio > 0) {
			double area =  Math.PI * Math.pow(radio, 2);
			System.out.println("Un círculo de radio " + radio + " tiene de área: " + area);

		}
				System.out.println("Fin de programa");

		
	}
}


/*
 * Programa que calcula el área de un círculo
 * Si el radio es cero o negativo, no hace
 * dicho cálculo, pero avisa al usuario del error
 */


public class CalcularArea3 {
	
	public static void main (String[] args) {
		
		//defines el radio
		double radio = -50;
		
		//si el radio no es cero o negativo se hace el cálculo
		if (radio > 0) {
			double area =  Math.PI * Math.pow(radio, 2);
			System.out.println("Un círculo de radio " + radio + " tiene de área: " + area);

		} else {
			System.out.println("No existen círculos de radio: " + radio);
		}
		
		System.out.println("Fin de programa");

		
	}
}


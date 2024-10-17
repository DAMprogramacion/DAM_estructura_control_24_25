public class MayorMenorIgualMath {
	
	public static void main (String[] args) {
		
		int x = 5, y = 5;
		System.out.println("Cotejando x " + x + " con y " + y);
		
		if (x == y) {
			System.out.println("x e y son iguales: " + x);
		} else {
			System.out.println("El mayor es " + Math.max(x, y));
			System.out.println("El menor es " + Math.min(x, y));

		}
		
	}
}

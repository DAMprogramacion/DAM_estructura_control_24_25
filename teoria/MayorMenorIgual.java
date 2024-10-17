
public class MayorMenorIgual {
	
	public static void main (String[] args) {
		
		int x = 6;
		int y = 5;
		System.out.println("Cotejando x " + x + " con y " + y);
		
		if (x == y) {
			System.out.println("x e y son iguales: " + x);
		} else if (x > y) {
			System.out.println("x es mayor que y " + x + " > " + y);
		} else {
			System.out.println("y es mayor que x " + y + " > " + x);
		}
		
	}
}


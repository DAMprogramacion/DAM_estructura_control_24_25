

public class MayorMenorTresValores {
	
	public static void main (String[] args) {
		
		int x = 5;
		int y = -5;
		int z = 0;
		System.out.println("Cotejando x " + x + " con y " + y + " y con z " + z);
		
		if ( x ==  y && x == z ) {
			System.out.println("Los tres nº son iguales: " + x);
		} else { 
			System.out.println("El mayor es " + Math.max(x, Math.max(y, z)));
			System.out.println("El menor es " + Math.min(x, Math.min(y, z)));
			if ((x >= y && x <= z) || (x <= y && x >=  z)) {
				System.out.println("El valor del medio es: " + x);
			} else if ((y >= x && y <= z) || (y <= x && y >=  z)) {
				System.out.println("El valor del medio es: " + y);
			} else {
				System.out.println("El valor del medio es: " + z);
			}
		}
		
	}
}


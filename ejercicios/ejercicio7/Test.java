public class Test {
		
	public static void main (String[] args) {
		//método que nos solicite los seis coeficientes (a, b, c, d, e, f)
		int a = Ecuaciones.solicitarCoeficiente();
		int b = Ecuaciones.solicitarCoeficiente();
		int c = Ecuaciones.solicitarCoeficiente();
		int d = Ecuaciones.solicitarCoeficiente();
		int e = Ecuaciones.solicitarCoeficiente();
		int f = Ecuaciones.solicitarCoeficiente();
		//vamos a mostrar en consola el sistema de ecuaciones a resolver:
		Ecuaciones.mostrarEcuacion(a, b, c, d, e, f);
		boolean resoluble = Ecuaciones.esResoluble(a, b, c, d);
		//System.out.println(resoluble);
		//si es resoluble decimos que "se resuelve"
		//en caso contrario indicamos "No es resoluble la ecuación"
		if (resoluble) {
			//System.out.println("se resuelve");
			float x = Ecuaciones.calcularX(a, b, c, d, e, f);
			float y = Ecuaciones.calcularY(a, b, c, d, e, f);
			System.out.println("Ecuación resoluble, soluciones:");
			System.out.printf("x = %.2f%n", x);
			System.out.printf("y = %.2f%n", y);
		} else 
			System.out.println("No es resoluble la ecuación");
		Ecuaciones.sc.close();
	}
	
}


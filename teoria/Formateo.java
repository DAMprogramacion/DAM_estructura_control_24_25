public class Formateo {
	
	public static void main (String[] args) {
		double numero = 1.22;
		System.out.printf("%.2f\n", numero);
		System.out.printf("%10.2f\n", numero);
		String cadena = "Total";
		System.out.printf("%s%n", cadena);
		System.out.printf("%S%n", cadena);
		System.out.printf("%-10S - %.2f%n", cadena, numero);


	}
}


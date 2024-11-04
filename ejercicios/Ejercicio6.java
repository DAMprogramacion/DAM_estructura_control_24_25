import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dígito");
		int digito = sc.nextInt();
		System.out.println("Introduce nº columnas");
		int numeroColumnas = sc.nextInt();
		
		System.out.println();
		for (int i = 1; i <= digito; i++) {
			System.out.printf("%5d", i);
			if (i % numeroColumnas == 0)
				System.out.println();
		}
	}
}


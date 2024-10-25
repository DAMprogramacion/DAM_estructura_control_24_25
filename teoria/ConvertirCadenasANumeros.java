
public class ConvertirCadenasANumeros {
	
	public static void main (String[] args) {
		
		String sNumero1 = "0";
		String sNumero2 = "-5";
		
		//hay que convertir cadenas a números
		//en este caso a enteros
		int iNumero1 = Integer.parseInt(sNumero1);
		int iNumero2 = Integer.parseInt(sNumero2);
		
		int multiplicacion = iNumero1 * iNumero2;
		
	  //System.out.println(sNumero1 + " * " + sNumero2 + " = " + multiplicacion);
		System.out.printf ("%s * %s  =  %d%n", sNumero1, sNumero2, multiplicacion ); 
		
		
	}
}


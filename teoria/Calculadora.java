/*
 * El programa se ejecuta como: java Calculadora argumento1 argumento2 argumento3
 * Ejemplos: java Calculardora 3 * 55   java Calculadora -2 / 23 ....
 * Las operaciones permitidas: * / % + - (argumento2)
 * 
 * Primero controlamos que haya mínimos tres argumentos:
 * 		Ejemplo java Calculadora 23 +  :  faltan argumentos
 * Contralamos el segundo argumento, debe ser las operaciones permitidas, sino damos mensaje
 *      Ejemplo java Calculadora 23 log 10:  operación log no permitida
 * Creamos tres variables: sNumero1, sOperador y sNumero2 a partir de los argumentos
 * Creamos dos variables: iNumero1 y iNumero2 usando Integer.parseInt
 * Usamos un switch(sOperador) ..... case "+"
 */


public class Calculadora {
	
	public static void main (String[] args) {
		//mínimo 3 argumentos:
		if (args.length < 3) {
			System.out.println("Faltan argumentos");
			return;  //sale del método main
		}
		
		System.out.println("Nº de argumentos correcto"); //operando1 operador operando2
		String sOperando1 = args[0];
		String operador   = args[1];
		String sOperando2 = args[2];
		//controlo el operando
		//if (operador == "+") incorrecto para cadenas, solo válido para tipos primitivos: int, double ...
		if (!(operador.equals("+") || operador.equals("-") || operador.equals("/") 
				|| operador.equals("%") || operador.equals("x")) ) {
			System.out.printf("%s: no permitido%n", operador);
			return;
		}
			
		//convetir los operando de String a int Integer.parseInt
		int iOperando1 = Integer.parseInt(sOperando1);
		int iOperando2 = Integer.parseInt(sOperando2);
		//usando un switch, controlamos el operador
		switch (operador) {
			
			case "+" -> 
				System.out.printf("%d + %d = %d\n", iOperando1, iOperando2, iOperando1 + iOperando2);
			case "-" -> 
				System.out.printf("%d - %d = %d\n", iOperando1, iOperando2, iOperando1 - iOperando2);
			case "/" ->{
				    if (iOperando2 == 0)
						System.out.println("División por cero");
					else
						System.out.printf("%d / %d = %d\n", iOperando1, iOperando2, iOperando1 / iOperando2);
				}
			case "%" -> {
				if (iOperando2 == 0) 
					System.out.println("División por cero");
				else
					System.out.printf("%d / %d = %d\n", iOperando1, iOperando2, iOperando1 / iOperando2);
			  }
			case "x" -> 
				System.out.printf("%d x %d = %d\n", iOperando1, iOperando2, iOperando1 * iOperando2);
			default  -> System.out.println("Operador no permitido");
		}
		
		

		
		
		
		
		
		
	}
}


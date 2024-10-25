public class ArgumentosSeguro {
	
	public static void main (String[] args) {
	   //el programa necesita un mínimo de dos argumentos
	   //así evita la excepción, String[] args es una colección
	   //y se puede saber el tamaño: args.length, es un int
	   
	   if (args.length >= 2) { 	
	       String argumento_0 = args[0];  //primer argumento
	       String argumento_1 = args[1];  //segundo argumento

	       System.out.println("Argumento 0: " + argumento_0);		   		
	       System.out.println("Argumento 1: " + argumento_1);
           } else {
    	       System.out.println("Faltan argumentos");
	   }	       
	}
}


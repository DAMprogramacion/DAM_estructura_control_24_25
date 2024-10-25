
public class BucleAnidados {
	
	public static void main (String[] args) {
		
		System.out.println("i - j - k");
		System.out.println("=========");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				for(int k = 0; k < 3; k++)
					System.out.println(i + " - " + j + " - " + k);
					
		System.out.println("::::::::::::");
		//Ahora usando bucles while
		System.out.println("i - j - k");
		System.out.println("=========");
		int i = 0, j = 0, k = 0;
		while (i < 3) {
			while (j < 3) {
				while (k < 3) {
					System.out.println(i + " - " + j + " - " + k);
					k++;
				}
				k = 0;
				j++;
			}
			j = 0;
			i++;
		}
	}
}


import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int valor;
		int j;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número: ");
			numeros[i] = sc.nextInt();
		}

		for (int i = 1; i < numeros.length; i++) {	
			valor = numeros [i];
			j = i - 1;
			
			while (j >= 0 && valor < numeros [j]) {
				numeros [j + 1] = numeros [j];
				j = j - 1;
	        }
			
	        numeros [j + 1] = valor;
	    }

	    for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}

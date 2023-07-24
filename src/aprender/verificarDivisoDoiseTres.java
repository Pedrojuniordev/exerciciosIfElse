package aprender;

import java.util.Scanner;

public class verificarDivisoDoiseTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numero = scanner.nextInt();
		
		if((numero % 2 ==0) && numero % 3 ==0) {
			System.out.println("Número é divisivel por 2 e 3.");
		}else {
			System.out.println("Número não é divisivel por 2 e 3. ");
		}
	}

}

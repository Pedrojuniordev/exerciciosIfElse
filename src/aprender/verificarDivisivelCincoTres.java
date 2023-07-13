package aprender;

import java.util.Scanner;

public class verificarDivisivelCincoTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		if ((numero % 5 ==0)&& numero %3 == 0) {
			System.out.println(numero + " É divisivel de 5 e 3. ");
		}else {
			System.out.println(numero + " Não é divisivel de 5 e 3.");
		}
		
	}

}

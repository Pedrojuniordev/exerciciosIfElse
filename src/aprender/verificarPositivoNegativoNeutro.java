package aprender;

import java.util.Scanner;

public class verificarPositivoNegativoNeutro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			System.out.print("O número é positivo.");
		} else if (numero < 0) {
			System.out.print("O número é negativo. ");
		} else {
			System.out.print("Número é igual a zero.");
		}
		
	}
}

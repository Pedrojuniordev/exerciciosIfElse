package aprender;

import java.util.Scanner;

public class verificarPositivoNegativoNeutro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero:");
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			System.out.print("O n�mero � positivo.");
		} else if (numero < 0) {
			System.out.print("O n�mero � negativo. ");
		} else {
			System.out.print("N�mero � igual a zero.");
		}
		
	}
}

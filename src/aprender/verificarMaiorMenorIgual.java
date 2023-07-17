package aprender;

import java.util.Scanner;

public class verificarMaiorMenorIgual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		if(numero > 0 ) {
			System.out.println("O número é maior que zero. ");
		} else if  (numero < 0) {
			System.out.println("O número é menor que zero. ");
		} else {
			System.out.println("O é zero. ");
			
			
		}
	}

}

package aprender;

import java.util.Scanner;

public class verificarMaiorMenorIgual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		if(numero > 0 ) {
			System.out.println("O n�mero � maior que zero. ");
		} else if  (numero < 0) {
			System.out.println("O n�mero � menor que zero. ");
		} else {
			System.out.println("O � zero. ");
			
			
		}
	}

}

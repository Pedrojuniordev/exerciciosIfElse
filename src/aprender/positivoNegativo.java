package aprender;

import java.util.Scanner;

public class positivoNegativo {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = Scanner.nextInt();
		
		if(numero > 0) {
			System.out.println("O n�mero � positivo.");
		}else if (numero < 0) {
			System.out.println("O numero � negativo.");
		}else {
			System.out.println("o n�mero � zero.");
			
		}
	}  
}

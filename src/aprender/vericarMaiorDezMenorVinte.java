package aprender;

import java.util.Scanner;

public class vericarMaiorDezMenorVinte {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		if(numero >= 10 && numero < 20) {
			System.out.println(" � igual ou maior a 10 e menor que 20.");
		}else  {
			System.out.println(" N�o � igual ou maior a 10 e menor que 20 ");
		}
	}

}

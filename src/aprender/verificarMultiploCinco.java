package aprender;

import java.util.Scanner;

public class verificarMultiploCinco {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.print("Digite um n�mero: ");
		numero = in.nextInt();
		 if(numero % 5 == 0) {
			 System.out.println("O n�mero " + numero + " � multiplo de 5. ");
		 }else {
			System.out.println(" O N�mero " + numero + " n�o � multiplo de 5.");
			 		
		 }
	
	}

}

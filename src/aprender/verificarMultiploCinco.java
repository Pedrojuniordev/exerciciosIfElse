package aprender;

import java.util.Scanner;

public class verificarMultiploCinco {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.print("Digite um número: ");
		numero = in.nextInt();
		 if(numero % 5 == 0) {
			 System.out.println("O número " + numero + " é multiplo de 5. ");
		 }else {
			System.out.println(" O Número " + numero + " não é multiplo de 5.");
			 		
		 }
	
	}

}

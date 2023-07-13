package aprender;

import java.util.Scanner;

public class verificarParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, par;
		
		System.out.print("Digite um número: ");
		numero = in.nextInt();
		par = (numero%2);
		
		if (par==0) {
			System.out.println("\n\t O número " + numero + " é par");
		}else {
			System.out.println("\n\t O número "+ numero + " é impar");
		}
	}

}

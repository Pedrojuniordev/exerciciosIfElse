package aprender;

import java.util.Scanner;

public class verificarParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, par;
		
		System.out.print("Digite um n�mero: ");
		numero = in.nextInt();
		par = (numero%2);
		
		if (par==0) {
			System.out.println("\n\t O n�mero " + numero + " � par");
		}else {
			System.out.println("\n\t O n�mero "+ numero + " � impar");
		}
	}

}

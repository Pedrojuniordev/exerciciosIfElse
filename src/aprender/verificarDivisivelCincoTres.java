package aprender;

import java.util.Scanner;

public class verificarDivisivelCincoTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		if ((numero % 5 ==0)&& numero %3 == 0) {
			System.out.println(numero + " � divisivel de 5 e 3. ");
		}else {
			System.out.println(numero + " N�o � divisivel de 5 e 3.");
		}
		
	}

}

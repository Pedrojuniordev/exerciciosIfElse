package aprender;

import java.util.Scanner;

public class verificarDivisivelTresOuCincoeAmbos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		if((numero % 5==0) && numero % 3 ==0) {
			System.out.println("Numero � divisivel por 5 e 3.");
		}else if(numero % 3 ==0) {
			System.out.println("N�mero � divisivel por 3.");
		}else if (numero % 5==0){
			System.out.println("Numero � divisivel por 5. ");
		}else {
			System.out.println("numero n�o divisivel por 5 e 3. ");
		}
	}

}

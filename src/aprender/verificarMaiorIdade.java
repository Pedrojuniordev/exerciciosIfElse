package aprender;

import java.util.Scanner;

public class verificarMaiorIdade {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		int idade = Scanner.nextInt();
		
		if(idade >=18){
			System.out.println("A pessoa é maior de idade.");
		}else {
			System.out.println("A pessoa é menor de idade.");
		}
	}
}

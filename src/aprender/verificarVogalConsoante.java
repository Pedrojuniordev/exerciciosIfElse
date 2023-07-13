package aprender;

import java.util.Scanner;

public class verificarVogalConsoante {

	//vogal =< 5 e consoante >=21
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um caractere: ");
		char caractere = scanner.next().charAt(0);
		
		//0 = 1;
        //1 = 2;
        // == equivale a =
		
		if(Character.isLetter(caractere)) {
			caractere = Character.toLowerCase(caractere);
			
		if(caractere =='a'||caractere =='e'||caractere =='i'||caractere =='o'||caractere =='u'){
			System.out.println("O caractere é uma Vogal");
		}else {
			System.out.println("O caractere é um Consoante.");
			}
		}else {
			System.out.println("O caractere não é uma Letra.");
		}
	}
}

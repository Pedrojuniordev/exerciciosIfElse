package aprender;

import java.util.Scanner;

public class anoBissexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();
		
		boolean bissexto = false;
		
		if(ano%4 ==0) {
			if(ano % 100 ==0) {
				if (ano% 400 ==0) {
					bissexto = true;
				}
			}else {
				bissexto = true;
			}
		}
		if (bissexto) {
			System.out.println(ano + "é ano bissexto.");
		}else {
			System.out.println(ano + "não é uma ano bissexto");
		}
	}
}

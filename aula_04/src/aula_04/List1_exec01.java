package aula_04;

import java.util.Scanner;

public class List1_exec01 {

	public static void main(String[] args) {
		// 01)Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. 
		//Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
		
		Scanner leia = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0; 
		int i;
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextInt();
		
		leia.close();
		
		if(num1 < num2) {
			for(i = num1; i < num2; i++) {
				if((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println(i + " é  multiplo de 3 e 5.");
				}
			}
			
		} else {
			System.out.println("Intervalo válido!");
		}
	
	}

}

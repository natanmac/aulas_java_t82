package aula_04;

import java.util.Scanner;

public class List3_exec06 {

	public static void main(String[] args) {
		// 06)Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		//Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.

		Scanner leia = new Scanner(System.in);
		int numInput, qtdNum = 0;
		float media, sumNumbers = 0;
		
		do {
			System.out.println("Digite um número: ");
			numInput = leia.nextInt();
			
			if(numInput % 3 == 0 && numInput != 0) {
				qtdNum += 1;
				sumNumbers += numInput;
			}
		} while(numInput != 0);
		
		System.out.println(sumNumbers);
		System.out.println(qtdNum);
		
		media = sumNumbers / qtdNum;
		
		System.out.println("A média de todos os números multiplos de 3: " + media);
		leia.close();
		
	}

}

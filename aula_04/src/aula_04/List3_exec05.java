package aula_04;

import java.util.Scanner;

public class List3_exec05 {

	public static void main(String[] args) {
		// 05) Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		//Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
		
		Scanner leia = new Scanner(System.in);
		int sumNumbers = 0;
		int numInput;
		
		do {
			System.out.println("Digite um número: ");
			numInput = leia.nextInt();
			
			if(numInput > 0) {
				sumNumbers++;
			}
			
		} while(numInput != 0);
		
		System.out.println("A soma dos números positivos: " + sumNumbers);
		
		leia.close();

	}

}

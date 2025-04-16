package aula_04;

import java.util.Scanner;

public class List1_exec02 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares.
		
		Scanner leia = new Scanner(System.in);
		int numInput, i;
		int numPares = 0;
		int numImpares = 0;
		
		for(i=1; i<11; i++) {
			System.out.println("Digite o " + i + "º Número: ");
			numInput = leia.nextInt();
			
			if((numInput % 2) != 0) {
				numImpares++;
			} else {
				numPares++;
			}
			leia.close();
		}
		
		System.out.println("Total de números pares: " + numPares);
		System.out.println("Total de números impares: " + numImpares);
		

	}

}

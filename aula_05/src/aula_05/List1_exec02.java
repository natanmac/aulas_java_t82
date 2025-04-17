package aula_05;

import java.util.Scanner;

public class List1_exec02 {

	public static void main(String[] args) {
		// 02) Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
		//Todos os elementos dos índices ímpares do vetor 
		//Todos os elementos do vetor que são números pares
		//A Soma de todos os elementos do vetor
		//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
		
		Scanner leia = new Scanner(System.in);
		int[] vetorInteiros = new int[10];
		int inputValue, media, sumValues = 0;
		
		for(int i=0; i < vetorInteiros.length; i++) {
			System.out.println("Digite um número inteiro: ");
			inputValue = leia.nextInt();
			sumValues += inputValue;
			
			if(inputValue % 2 == 0) {
				System.out.println("Elemento par: " + inputValue);
			} else {
				System.out.println("Elemento ímpar: " + inputValue);
			}
		}
		
		media = sumValues/vetorInteiros.length;
		System.out.println("A média dos valores é: " + media);
		
		leia.close();

	}

}

package aula_03;

import java.util.Scanner;

public class List1_exec02 {

	public static void main(String[] args) {
		// 02) Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando 
		//se este número é par ou ímpar e se o número é positivo ou negativo.
		
		Scanner leia = new Scanner(System.in);
		float num;
		
		System.out.println("Digite um número: ");
		num = leia.nextFloat();
		
		float resParImpar = num % 2;
		
		boolean resPosNeg = num > 0;
		
		if (resParImpar > 0) {
			System.out.println("O número é ímpar.");
		} else {
			System.out.println("O número é par.");
		}
		
		if (resPosNeg) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("O número é negaivo");
		}
		
		leia.close();

	}

}

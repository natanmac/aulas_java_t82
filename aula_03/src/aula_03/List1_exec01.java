package aula_03;

import java.util.Scanner;

public class List1_exec01 {

	public static void main(String[] args) {
		// 01) Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		Scanner leia = new Scanner(System.in);
		
		int numA, numB, numC, res;
		
		System.out.println("Digite o número A: ");
		numA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numC = leia.nextInt();
		
		res = numA + numB;
		
		if (res == numC) {
			System.out.println("A soma e A e B é igual a C!");
		} else if (res > numC) {
			System.out.println("A soma e A e B é maior a C!");
		} else {
			System.out.println("A soma e A e B é menor a C!");
		}
		
		leia.close();

	}

}

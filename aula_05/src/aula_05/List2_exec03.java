package aula_05;

import java.util.Scanner;

public class List2_exec03 {

	public static void main(String[] args) {
		// 03) Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
		//Todos os elementos da Diagonal Principal
		// Todos os elementos da Diagonal Secundária
		// A Soma de todos os elementos da Diagonal Principal
		// A Soma de todos os elementos da Diagonal Secundária
		
		Scanner leia = new Scanner(System.in);
		int[][] matrizInteiros = new int[3][3];
		int sumPrincipal, sumSecundaria, inputValue;
		
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 3; coluna++) {
				System.out.println("Digite o valor para a posição: [" + linha + "][" + coluna + "]");
				inputValue = leia.nextInt();
				matrizInteiros[linha][coluna] = inputValue;
			}
		}
		
		sumPrincipal = matrizInteiros[0][0] + matrizInteiros[1][1] + matrizInteiros[2][2];
		sumSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];
		
		System.out.printf("\nOs valores da diagonal principal: [%d][%d][%d]", matrizInteiros[0][0], matrizInteiros[1][1], matrizInteiros[2][2]);
		System.out.printf("\nOs valores da diagonal secundária: [%d][%d][%d]", matrizInteiros[0][2], matrizInteiros[1][1], matrizInteiros[2][0]);
		System.out.println("\nA soma da diagonal secundária: " + sumPrincipal);
		System.out.println("A Soma da diagonal secundária: " + sumSecundaria);
		
		leia.close();

	}

}

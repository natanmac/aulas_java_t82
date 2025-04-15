package aula_03;

import java.util.Scanner;

public class List2_exec07 {

	public static void main(String[] args) {
		// 07) Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. 
		//O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). 
		//A seguir, mostre na tela o resultado da operação entre os 2 números. 
		//Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o 1º número: ");
		float num1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		float num2 = leia.nextFloat();
		
		System.out.println("Digite o tipo da operação (1 - soma; 2 - subtração; 3 - multiplicação; 4 - divisão): ");
		int operacao = leia.nextInt();
		
		switch (operacao) {
		case 1: {
			System.out.println("Resultado da soma: " + (num1 + num2));
			break;
		} case 2: {
			System.out.println("Resultado da subtração: " + (num1 - num2));
			break;
		} case 3: {
			System.out.println("Resultado da multiplicação: " + (num1 * num2));
			break;
		} case 4: {
			System.out.println("Resultado da divisão: " + (num1 / num2));
			break;
		}
		default:
			System.out.println("Valor de operação inválido!");
		}
		
		leia.close();

	}

}

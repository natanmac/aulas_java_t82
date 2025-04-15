package aula_03;

import java.util.Scanner;

public class List2_exec05 {

	public static void main(String[] args) {
		/*
		  05) Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
		  A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
		*/
		
		Scanner leia = new Scanner(System.in);
		int codProduto, qtdProduto, valorFinal;
		
		System.out.println("Digite o código do produto: ");
		codProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade do produto: ");
		qtdProduto = leia.nextInt();
		
		switch (codProduto) {
		case 1: {
			valorFinal = qtdProduto * 10;
			System.out.println("Produto: Cachorro quente; Valor total: " +  valorFinal);
			break;
		} case 2: {
			valorFinal = qtdProduto * 15;
			System.out.println("Produto: X-Salada; Valor total: " +  valorFinal);
			break;
		} case 3: {
			valorFinal = qtdProduto * 18;
			System.out.println("Produto: X-Bacon; Valor total: " +  valorFinal);
			break;
		} case 4: {
			valorFinal = qtdProduto * 12;
			System.out.println("Produto: Bauru; Valor total: " +  valorFinal);
			break;
		} case 5: {
			valorFinal = qtdProduto * 8;
			System.out.println("Produto: Refrigerante; Valor total: " +  valorFinal);
			break;
		} case 6: {
			valorFinal = qtdProduto * 13;
			System.out.println("Produto: Suco de laranja; Valor total: " +  valorFinal);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + codProduto);
		}
		
		leia.close();

	}

}

package aula_04;

import java.util.Scanner;

public class List2_exec03 {

	public static void main(String[] args) {
		// 03) Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
		//e o total de pessoas cuja idade seja maior que 50 anos. 
		//A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		
		Scanner leia = new Scanner(System.in);
		int numInput = 0;
		int menorIdade = 0;
		int maiorIdade = 0;
		
		while (numInput >= 0) {
			System.out.println("Digite uma idade: ");
			numInput = leia.nextInt();
			
			if(numInput > 0 && numInput < 21) {
				menorIdade++;
			} else if(numInput > 50) {
				maiorIdade++;
			}
			
		}
		
		System.out.println("O total de pessoas menores de 21: " + menorIdade);
		System.out.println("O total de pessoas maiores de 50: " + maiorIdade);
		
		leia.close();

	}

}

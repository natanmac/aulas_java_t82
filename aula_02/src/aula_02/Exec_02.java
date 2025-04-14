package aula_02;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {
		// 2) Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela a média final do participante.

		float nota01, nota02, nota03, nota04, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a 1º nota: ");
		nota01 = leia.nextFloat();
		
		System.out.println("Digite a 2º nota: ");
		nota02 = leia.nextFloat();
		
		System.out.println("Digite a 3º nota: ");
		nota03 = leia.nextFloat();
		
		System.out.println("Digite a 4º nota: ");
		nota04 = leia.nextFloat();
		
		media = ((nota01 + nota02 + nota03 + nota04)/4);
		
		System.out.println("A média do aluno: " + media);
		
	}

}

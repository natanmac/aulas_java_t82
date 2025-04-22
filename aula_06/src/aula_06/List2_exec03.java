package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class List2_exec03 {

	public static void main(String[] args) {
		// 03) Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
		//O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set.
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> setNumbers = new HashSet<Integer>();
		
		for(int i=1; i < 11; i++) {
			System.out.println("Digite o " + i + " º número da lista: ");
			int inputNumber = leia.nextInt();
			setNumbers.add(inputNumber);
		}
		
		System.out.println(setNumbers);
		
		leia.close();

	}

}

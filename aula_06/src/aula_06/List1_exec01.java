package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class List1_exec01 {

	public static void main(String[] args) {
		// 01)Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
		//O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
		//Mostre na tela todas as cores que foram adicionadas. 
		//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i=1; i < 6; i++) {
			System.out.println("Digite o " + i + "º cor da lista");
			String inputColor = leia.next();
			cores.add(inputColor);
		}
		
		System.out.println("\nListando todas as cores: " + cores);
		
		cores.sort(null);
		System.out.println("\nListado as cores em ordem alfabética: " + cores);

		leia.close();
	}

}

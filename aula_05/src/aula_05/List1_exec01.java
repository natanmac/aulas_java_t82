package aula_05;

import java.util.Scanner;

public class List1_exec01 {

	public static void main(String[] args) {
		// 01) Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, 
		//onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, 
		//a mensagem: “Não foi encontrado!” deve ser exibida na tela.
		
		Scanner leia = new Scanner(System.in);
		int vetorInteiro[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite um número inteiro que deseja encontrar: ");
		int numSearch = leia.nextInt();
		
		for(int i=0; i < vetorInteiro.length; i++) {
			if(numSearch == vetorInteiro[i]) {
				System.out.println("O número: " + numSearch + " está na posição: " + i);
			} else if(i == (vetorInteiro.length - 1)) {
				System.out.println("O número " + numSearch + " não está presente no vetor.");
			}
		}
		
		leia.close();

	}

}

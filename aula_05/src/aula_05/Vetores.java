package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {10, 5, 35, 70, 140};
		
		float vetorReal[] = new float[5];
		
		System.out.println("Posição [0]: " + vetorInteiros[0]);
		
		for(int indice=0; indice < vetorInteiros.length; indice++) {
			System.out.printf("\nvetorInteiros[%d] = %d", indice, vetorInteiros[indice]);
		}
		
		for(int indice=0; indice < vetorReal.length; indice++) {
			System.out.println("\nDigite um número real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		for(var valor : vetorReal) {// o var entende o tipo da variavel diretamente
			System.out.println("Elemento atual: " + valor); //Percorre o vetor do inicio ao fim (for it)
		}
		
		Arrays.sort(vetorReal);//ordenar os valores do array
		//Array.sort(vetorReal, collections.reverseOrder()); -> para ordem decrescente se já estiver ordenado em crescente
		
		for(var valor : vetorReal) {// o var entende o tipo da variavel diretamente
			System.out.println("Elemento atual: " + valor); //Percorre o vetor do inicio ao fim (for it)
		}
		
		leia.close();

	}

}

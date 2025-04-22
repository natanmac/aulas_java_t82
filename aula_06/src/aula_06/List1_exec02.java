package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class List1_exec02 {

	public static void main(String[] args) {
		// 02) Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
		//O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection. 
		//Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que quer localizar: ");
		int numInput = leia.nextInt();
		
		if(numeros.contains(numInput)) {
			System.out.println("O número: " + numInput + " está localizado na posição: " + numeros.indexOf(numInput));
		} else {
			System.out.println("O número: " + numInput + " não foi encontrado na lista!");
		}
		
		leia.close();
	}

}

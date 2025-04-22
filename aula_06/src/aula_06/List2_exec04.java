package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class List2_exec04 {

	public static void main(String[] args) {
		// 04) Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
		//O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! 
		//Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> setNumber = new HashSet<Integer>();
		
		setNumber.add(2);
		setNumber.add(6);
		setNumber.add(5);
		setNumber.add(24);
		setNumber.add(8);
		setNumber.add(9);
		setNumber.add(1);
		setNumber.add(10);
		setNumber.add(96);
		setNumber.add(3);
		
		System.out.println("Digite o valor que deseja encontrar: ");
		int inputNumber = leia.nextInt();
		
		if(setNumber.contains(inputNumber)) {
			System.out.println("O número digitado está presente na lista!");
		} else {
			System.out.println("O número não está presente na lista");
		}
		
		leia.close();

	}

}

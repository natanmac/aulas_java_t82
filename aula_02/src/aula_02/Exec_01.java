package aula_02;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {
		// 01) Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java:
		
		float salario, abono;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		System.out.println("O resultado: " + (salario + abono));

	}

}

package aula_02;

import java.util.Iterator;
import java.util.Scanner;

public class Exec_04 {

	public static void main(String[] args) {
		// 4) Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4;
		double diferenca;
		
		System.out.println("Insira o valor: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença dos valores: " + diferenca);

	}

}

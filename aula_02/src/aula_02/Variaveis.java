package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Definição das variáveis
		System.out.println("Digite o primeiro número inteiro: ");
		int num_input = leia.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int num_input2 = leia.nextInt();
		
		int numero_01 = 50;
		int numero_02 = 25;
		char opcao = 'V'; //Sempre usar aspas simples
		boolean menorIdade = false;
		
		System.out.println("Digite seu nome: ");
		String nome_input = leia.next();
		
		String nome = "Natan";//Por ser classe, vc pode colocar nome. para acessar os metodos dela
		
		// Definição de constante
		final double PI = 3.1415;
		
		// Atribuição de valor
		numero_02 = 75;
		
		// Exibir na tela
		System.out.println(num_input);
		System.out.println(num_input2);
		System.out.println(nome_input);
		System.out.println("Variável número 1 é igual a: " + numero_01);
		System.out.println("Variável número 2 é igual a: " + numero_02);
		System.out.println("Constante PI é igual a: " + PI);
		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
		
	}

}

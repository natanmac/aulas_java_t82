package aula_07;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Exec02 {

	public static void main(String[] args) {
		// 02) Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar a retirada de livros de uma pilha. 
		//O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		// 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		// 2: Listar todos os livros da Pilha
		// 3: Retirar um livro da pilha 
		// 0: O programa deve ser finalizado. 
		// Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int inputOption = 1;
		String inputBook;
		
		while(inputOption != 0) {
			System.out.println("\n1 - Adicionar um livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\nEscolha uma opção: ");
			inputOption = leia.nextInt();
			leia.nextLine();
			
			if(inputOption == 1) {
				System.out.println("\nInsira o nome do livro: ");
				inputBook = leia.nextLine();
				pilha.push(inputBook);
			} else if (inputOption == 2) {
				for(var book : pilha) {
					System.out.println(book);
				}
			} else if (inputOption == 3) {
				try {
					pilha.pop();
				} catch(EmptyStackException e) {
					System.out.println("A pilha de livros está vazia, insira um livro primeiro!");
				}
			} else if (inputOption == 0) {
				System.out.println("\nPrograma finalizado");
			} else {
				System.out.println("\nOpção inválida");
			}
		}
		
		leia.close();

	}

}

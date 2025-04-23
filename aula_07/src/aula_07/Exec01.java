package aula_07;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {
		// 01) Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada dos Clientes de um Banco. 
		//O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		//1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		//2: Listar todos os Clientes na fila
		//3: Chamar (retirar) uma pessoa da fila 
		//0: O programa deve ser finalizado. 
		//Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int inputOption = 1;
		String inputName;
		
		while(inputOption != 0) {
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("\nEscolha uma opção: ");
			inputOption = leia.nextInt();
			leia.nextLine();
			
			if(inputOption == 1) {
				System.out.println("\nInsira o nome: ");
				inputName = leia.nextLine();
				fila.add(inputName);
			} else if (inputOption == 2) {
				for(var nome : fila) {
					System.out.println(nome);
				}
			} else if (inputOption == 3) {
				try {
					fila.remove();
				} catch(NoSuchElementException e) {
					System.out.println("\nNão tem clientes na fila, espere a chegada de mais clientes.");
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

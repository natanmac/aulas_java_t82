package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Criamos a coleção arrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		// Adicionando valores na coleção arrayList
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		/*System.out.println("Digite um número real: ");
		double inputNumero = leia.nextDouble();
		
		numeros.add(inputNumero);*/
		
		// Listando os valores da coleção arrayList
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println(numeros);
		
		// Posição de elemento dentro da lista
		System.out.println("Indice do número 9: " + numeros.indexOf(9.0));
		
		System.out.println("O número 9 existe na coleção? " + numeros.contains(9.0));
		
		System.out.println("Qual valor está armazenado no indice 2? " + numeros.get(2));
		
		// ordenar coleção
		numeros.sort(null);
		System.out.println(numeros);
		
		numeros.sort(Comparator.reverseOrder());
		System.out.println(numeros);
		
		// Alterar valor de um elemento
		numeros.set(2, 10.0);
		
		numeros.forEach(System.out::println);
		
		// Excluir valores
		numeros.remove(2.0);
		
		System.out.println(numeros);
		
		leia.close();

	}

}

package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta);
		}
		
		System.out.println("Morango existe na coleção: " + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		
		System.out.println("Morango existe na coleção: " + frutas.contains("Morango"));
		
		//Criar um iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}

	}

}

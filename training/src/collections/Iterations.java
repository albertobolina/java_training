package collections;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Iterations {

	// um iterator é um objecto que permite iterar pelos elementos de uma colecção
	// todas as classes que descendem do interface Collection herdam o método "iterator", que devolve um objecto "iterator"
	
	public static void main(String[] args) {
		
		// Set é um interface que herda do interface Collection
		Set<String> frutas = new HashSet<>();
		frutas.add("maçã");
		frutas.add("pêra");
		frutas.add("limão");
		frutas.add("pessego");
		
		System.out.println("\nIteração sobre um Set");
		
		// o método devolve um objecto Iterator, que é um iterador sobre os elementos do Set 
		var i = frutas.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		// List é um interface que herda do interface Collection
		List<String> maisfrutas = new ArrayList<>();
		maisfrutas.add("pessego");
		maisfrutas.add("limão");
		maisfrutas.add("laranja");
		maisfrutas.add("maçã");
		maisfrutas.add("cereja");
		
		System.out.println("\nIteração sobre uma List");
		
		// o método devolve um objecto Iterator, que é um iterador sobre os elementos do List 
		var y = maisfrutas.iterator();
		while (y.hasNext()) {
			System.out.println(y.next());
		}
		
		
		// List é um interface que herda do interface Collection
		Queue<String> aindaFrutas = new LinkedList<>();		
		aindaFrutas.add("pessego");
		aindaFrutas.add("limão");
		aindaFrutas.add("laranja");
		aindaFrutas.add("maçã");
		aindaFrutas.add("cereja");
		
		System.out.println("\nIteração sobre uma Queue");
		
		// o método devolve um objecto Iterator, que é um iterador sobre os elementos da Queue 
		var n = maisfrutas.iterator();
		while (n.hasNext()) {
			System.out.println(n.next());
		}
		
		
		// Map não herda de Collection, mas usando o seu método "entrySet()", podemos obter um iterador 
		// para o seu conteudo

	}

}

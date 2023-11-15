package collections;

import java.util.List;
import java.util.ArrayList;

//List é um interface que herda do interface Collections

public class Lists {
	
	// List é um interface que implementa classes ordenadas e indexadas
	public static void main(String[] args) {
		
		// como List é um interface, não pode ser instanciada directamente
		// ArrayList é uma das suas implementações
		// List frutas = new ArrayList();					// declaração na forma antiga, agora usa-se a forma generica, em baixo
		List<String> frutas = new ArrayList<>();
		
		// adicionar objectos a uma lista
		frutas.add("pessego");
		frutas.add("limão");
		frutas.add("laranja");
		frutas.add("maçã");
		frutas.add("cereja");
		
		System.out.println(frutas);
		
		// obter um item por indice
		System.out.println("obter a laranja " + frutas.get(1));
		
		// podemos alterar um elemento usando o seu indice
		frutas.set(2, "uvas");
		System.out.println(frutas);
		
		// uma List pode ter elementos duplicados
		frutas.add("limão");
		System.out.println(frutas);
		
		// podemos obter o indice de um elemento. em caso de duplicado devolve o indice do primeiro
		System.out.println(frutas.indexOf("limão"));
		
		//podemos obter o indice do ultimo elemento duplicado
		System.out.println(frutas.lastIndexOf("limão"));
		
		// para eliminar elementos existe um método com dois overloads: por indice e por objecto
		frutas.remove("limão");   // remove a primeira ocurrencia deste objecto
		System.out.println(frutas);
		
		frutas.remove(3);
		System.out.println(frutas);
		
		// tambem podemos criar listas imutaveis
		List<String> maisFruta = List.of("morangos", "cerejas", "nesperas");
		System.out.println(maisFruta);
		
		
	}
}

package collections;

import java.util.ArrayList;
import java.util.List;

public class forloops {

	public static void main(String[] args) {
		
		// exemplos de iterações usando os varios tipos de for 
		
		// numa List (exemplo 1)
		List<String> frutas = new ArrayList<>();
		frutas.add("pessego");
		frutas.add("limão");
		frutas.add("laranja");
		frutas.add("maçã");
		frutas.add("cereja");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
		for(int i = 0; i < frutas.size(); i++) {
			System.out.println(frutas.get(i));
		}
		
		
		// numa List (exemplo 2)
		System.out.println("\n");
		List listFrutas = new ArrayList();
		listFrutas.add("pessego");
		listFrutas.add("limão");
		listFrutas.add("laranja");
		listFrutas.add("maçã");
		listFrutas.add("cereja");
				
		for(Object fruta: listFrutas) {            // quando se criou a List não se defeniu o tipo de dados que ia conter (como no exemp 1)
			System.out.println((String)fruta); 	   // portanto quando se extrai um elemento da List, ele vem com tipo Object. É preciso fazer o cast
		}
				
				
		

	}

}

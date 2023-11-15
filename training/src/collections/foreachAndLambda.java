package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class foreachAndLambda {

	public static void main(String[] args) {
		
		// aqui demonstramos uma outra forma iterar atraves de uma colecção
		// qualquer classe que herde de colection pode usar o método forEach()
		
		// exemplo de List
		System.out.println("EXEMPLO DE COM LIST");
		
		List<String> listaFrutas = new ArrayList<>();
		
		// adicionar objectos a uma lista
		listaFrutas.add("pessego");
		listaFrutas.add("limão");
		listaFrutas.add("laranja");
		listaFrutas.add("maçã");
		listaFrutas.add("cereja");
		
		// como parametro passamos ao método forEach a acção que queremos efectuar por cada iteração
		// neste caso passamos uma função lambda, em que f é o actual elemento da lista. O f antes do simbolo "->" é o input da função
		listaFrutas.forEach(f -> System.out.println(f));
		
		// neste caso, como o foreach só tem de executar simplesmente um método, podemos simplificar passando ao método forEach uma 
		// referencia do método a executar
		// oinput do método a executar é entendido automaticamente como o actual elemento do List
		listaFrutas.forEach(System.out::println);
		
		
		// o seguinte pode ser o exemplo de uma função Lambda mais complexa
		listaFrutas.forEach(f -> {
			f = "fruta : " + f;
			System.out.println(f);
		});
		
		
		// exemplo de Map
		System.out.println("EXEMPLO DE COM MAP");
		
		Map<String, Integer> caloriasFruta = new HashMap<>();
		
		caloriasFruta.put("maçã", 95); 
		caloriasFruta.put("limão", 20);
		caloriasFruta.put("banana", 195);
		caloriasFruta.put("laranja", 45);
	
		// neste casoo exemplo é semelhante, mas como há dois parametros de entrada estes têm de estar dentro de parentesis
		caloriasFruta.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}

package collections;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// o interface Map permite criar coleções (embora não herde da coleção collection) de chave, valor
		
		Map<String, Integer> caloriasFruta = new HashMap<>();
		
		caloriasFruta.put("maçã", 95); // maçã é a chave, 95 é o valor. No entanto qualquer tipo de objecto pode ser chave ou valor
		caloriasFruta.put("limão", 20);
		caloriasFruta.put("banana", 195);
		caloriasFruta.put("laranja", 45);
		
		System.out.println("ponto 1 - " + caloriasFruta);
		
		System.out.println("este Map tem " + caloriasFruta.size() + " elementos");
		
		
		caloriasFruta.put("limão", 25); // se repetirmos uma chave, é o mesmo que fazer um update
		System.out.println("ponto 2 - " + caloriasFruta);
		
		caloriasFruta.putIfAbsent("laranja", 47);  // insere se a chave ainda não existir, caso contrario não faz nada
		System.out.println("ponto 3 - " + caloriasFruta);
		
		caloriasFruta.replace("maçã", 90);    // substitui o valor apenas se a chave existir
		caloriasFruta.replace("cereja", 96);  // se não existir, não faz nada
		System.out.println("ponto 4 - " + caloriasFruta);
		
		
		System.out.println("laranja : " + caloriasFruta.get("laranja"));   // usamos a chave para obter o valor
		
		caloriasFruta.remove("limão");         // usando a chave, removemos o par chave, valor
		System.out.println("ponto 5 - " + caloriasFruta);
		
		System.out.println("Contem a chave banana ? " + caloriasFruta.containsKey("banana"));
		System.out.println("Contem o valor 100 ? " + caloriasFruta.containsValue(100));
		
		// tambem aqui podemos criar Maps imutaveis
		Map<String, Integer> caloriasMaisFrutas = Map.of(
				"melão", 124, 
				"pessego", 101);
		System.out.println("ponto 6 - " + caloriasMaisFrutas);
		
		
		// há um conjunto de métodos de Map que devolvem um objecto do tipo Set
		// isto é util pois podemos, sobre esse objecto, usar os métodos de Set
		Set mapEntries = caloriasFruta.entrySet(); 
		System.out.println("ponto 7 - " + mapEntries);
		Set<String> mapKeys = caloriasFruta.keySet();
		System.out.println("ponto 8 - " + mapKeys);
		Collection<Integer> valores = caloriasFruta.values();
		System.out.println("ponto 9 - " + valores);
		
		
		
		

	}

}

package collections;

import java.util.Set;
import java.util.HashSet;

public class Sets {
	
//Set é um interface que herda do interface Collections
	
	public static void main(String[] args) {
		
		// o Set representa uma colecção, que pode conter um conjunto de dados unicos e não ordenados
		// o Set é um interface, não pode ser instanciado
		// o HashSet é uma das suas implementações
		// Set frutas = new HashSet();					// declaração na forma antiga, agora usa-se a forma generica, em baixo
		Set<String> frutas = new HashSet<>();
		
		frutas.add("pêra");
		frutas.add("maçã");
		frutas.add("melão");
		
		System.out.println(frutas);
		System.out.println("Contem melão?: " + frutas.contains("melão")); //pode verificar se contem um certo elemento
		System.out.println("Numero de elementos que contem: " + frutas.size()); 
		
		frutas.remove("melão");    //podemos remover objectos
		System.out.println(frutas);
		
		// podemos adicionar uma coleção de dados a um Set de uma só vez
		Set<String> maisFruta = Set.of("uvas", "pessego", "figo");
		System.out.println(maisFruta);
		
		// criar um set desta maneira torna o imutavel, ou seja, não pode ser alterado
		// portanto as instruções seguintes não são validas
		// maisFruta.add("cereja");
		// maisFruta.remove("uvas");
	}
	

}

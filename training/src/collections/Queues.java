package collections;

import java.util.Queue;
import java.util.LinkedList;

// Queue é um interface que herda do interface Collections

public class Queues {

	public static void main(String[] args) {
		
		// as queues são FIFO
		// Queue frutas = new LinkedList();     // declaração na forma antiga, agora usa-se a forma generica, em baixo
		Queue<String> frutas = new LinkedList<>();
		
		// adicionar objectos a uma lista. O 1º objecto da fila é o Head, o ultimo é o Tail
		frutas.add("pessego");
		frutas.add("limão");
		frutas.add("laranja");
		frutas.add("maçã");
		frutas.add("cereja");
		
		// remove sempre o Head da fila
		var removido = frutas.remove();
		System.out.println("elemento removido " + removido);
		
		// podemos verificar qual será o proximo a ser removido
		var proximo = frutas.peek();
		System.out.println("proximo a remover" + proximo);
		
		
		

	}

}

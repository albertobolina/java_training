package polymorphism;

public class Zoo2 {

	public static void main(String[] args) {
		
		// ------- exemplos de polimorfismo -----------------
		
		// --- instanceof operator -----
		Animal rocky = new Dog();            // rocky é uma instancia de Dog, mas do tipo Animal
		Animal sasha = new Cat();
		
		if (rocky instanceof Animal) {     // devolve true, pois a classe Dog descende da classe Animal 
			System.out.println("rocky é um animal");
		}
		
		if (rocky instanceof Dog) {     // devolve true 
			System.out.println("rocky é um Dog");
		}
		
		if (rocky instanceof Cat) {     // devolve false 
			System.out.println("rocky é um Cat");
		}
		
		feed(rocky);   // exemplo da utilização do operador instanceof
		feed(sasha);
		
		
	}
	
	public static void feed(Animal bichoComFome) {     // exemplo da utilização do operador instanceof
		if (bichoComFome instanceof Dog) {
			System.out.println("Toma comida de cão");
		}
		else if (bichoComFome instanceof Cat) {
			System.out.println("Toma comida de gato");
		}
	}

}

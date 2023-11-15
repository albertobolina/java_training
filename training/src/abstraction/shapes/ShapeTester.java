package abstraction.shapes;

public class ShapeTester {

	public static void main(String[] args) {
		
		// Shape rectangulo = new Shape();    // ERRO, pois uma classe abstracta não pode ser instanciada
		Shape rectangulo = new Rectangulo(20, 12);
		
		System.out.println("A area do rectangulo é " + rectangulo.calculateArea());    // executa o método implementado (override) pela classe Rectangulo
		System.out.println("A cor do retangulo é " + rectangulo.getColor());    
		
		rectangulo.print();      // método herdado de Shape, sem necessidade de override, pois não é abstracto em Shape
	}

}

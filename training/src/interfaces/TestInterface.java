package interfaces;

public class TestInterface {

	public static void main(String[] args) {
		
		Book livro = new Book("Fuga ontem", "Manel jaquim", 23);
		
		System.out.println(String.format("Titulo: %s, Autor: %s ", livro.getName(), livro.getAuthor()));
		
		Product.printInterfaceName();         // exemplo de uso de um método estatico do interface
		

	}

}

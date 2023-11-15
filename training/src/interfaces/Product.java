package interfaces;

public interface Product {
	
	// String name = "pedro";    // nos interfaces podemos definir campos, mas estes serão automaticamente "static" e "final", portanto, serão na verdade constantes
	
	
	// ### abstract methods ###
	
	String getName();            // a menos que seja indicado o contrario, todos os métodos declarados num interface serão automaticamente "abstract" e 	
								 // como tal tem de ser obrigatoriamente implementados nas classes que usarem o interface
	void setName(String name);
	
	
	// ### default methods ###
	
	default double getPrice() {return 12;}    // os métodos default não têm de ser obrigatoriamente implementados pelas classes que usam o interface, mas
	default void setPrice(double price) {}   // estarão disponiveis para estas
											 // são uteis para manter a retro-compatibilidade, ou seja, se num interface criamos um novo método "abstract", todas as
	                                         // classes que o usam têm de ser alteradas para o implementar. No entanto, se no interface criarmos o novo método como "default", isso 
	                                         // já não é obrigatorio
	
	
	// ### static methods ###
	
    static void printInterfaceName() {
    	System.out.println("interface de nome Product");
    }
}

package inheritance;

public class Empregado extends Person{
    
	// esta classe herda todos os métodos e campos da classe Person, que estejam marcados como 
	// "public" ou "protected"
	// os que estão marcados como "private" não serão herdados, mas neste caso podem ser acedidos via os
	// métodos get e set
	private String empregadoId;
	private String titulo;
	
	// construtor por omissão.
	public Empregado() { 
						// implicitamente, a primeira instrução a ser executada num construtor é o construtor default da classe pai
		super("Manel"); // se for invocado explicitamente um construtor da classe pai, está tem de ser a primeira instrução do construtor
						// da classe filha
		
		System.out.println("Estamos no construtor por omissão de Empregado");
		
	}
	
	public String getEmpregadoId() {
		return empregadoId;
	}
	public void setEmpregadoId(String empregadoId) {
		this.empregadoId = empregadoId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}

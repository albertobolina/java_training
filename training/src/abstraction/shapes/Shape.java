package abstraction.shapes;

public abstract class Shape {         // abstract classes não podem ser instanciadas, servem como um modelo para ser herdado (extended)

	private String color;         // classe abstracta pode ter campos public, private, protected, etc
	
	abstract double calculateArea();    // os métodos abstractos não tem defenição. Têm de ser, obrigatoriamente, implementados pelas classes que 
	                                    // que herdem da classe abstract
	
	public void print() {                                          // este método não é abstract. A classe que herde desta não tem obrigação de implementar
		System.out.println("Eu sou uma forma!");
	}

	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}

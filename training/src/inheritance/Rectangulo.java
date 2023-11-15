package inheritance;

public class Rectangulo {
	
	// campos da classe 
	protected double length;      // o modificador "protected" define que a variavel (ou método) seja acessivel apenas dentro do 
	protected double width;       // proprio "package" ou desde classes que herdem da classe onde esta variavel está defenida
	protected double sides = 4;
	
	// getters e setters
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	// métodos da classe
	public double calculaPerimetro() {
		return (2 * length) + (2 * width);
	}
	
	public void print() {
		System.out.println("Eu sou um rectangulo");
	}

}

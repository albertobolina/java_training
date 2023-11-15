package abstraction.shapes;

public class Rectangulo extends Shape {    

	private double length;
	private double width;
	
	public Rectangulo(double length, double width) {
		setLength(length);
		setWidth(width);
		setColor("branco");
	}
	
	@Override
	double calculateArea() {
		
		return length * width;
	}

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
	
	

}

package inheritance.challenge;

public class Cake {
	
	private String flavor;
	private double price;
	
	public Cake() {
		this("Morango");            //podia assignar directamente o valor ao campo "flavor", mas tambem pode ser feito chamado o outro construtor
		// this.flavor = "Morango";
	}
	public Cake(String flavor) {
		this.flavor = flavor;
	}
	

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}

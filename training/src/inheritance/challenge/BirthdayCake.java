package inheritance.challenge;

public class BirthdayCake extends Cake {

	private int candles;
	
	public BirthdayCake() {
		super("Chocolate");
		//setFlavor("Chocolate");
	}
	
	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}

	

}

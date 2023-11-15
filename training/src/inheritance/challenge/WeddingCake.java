package inheritance.challenge;

public class WeddingCake extends Cake{
	
	private int tiers;
	
	public WeddingCake() {
		super("Amendoa");
		// setFlavor("Amendoa");
	}

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}
	
	

}

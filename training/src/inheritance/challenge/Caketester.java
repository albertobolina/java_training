package inheritance.challenge;

public class Caketester {

	

	public static void main(String[] args) {
	
		Cake bolo = new Cake();
		bolo.setPrice(29.99);
		
		BirthdayCake boloAniv = new BirthdayCake();
		boloAniv.setPrice(9.99);
		
		WeddingCake boloCasam = new WeddingCake();
		boloCasam.setFlavor("Pina colada");
		boloCasam.setPrice(350);
		
		
		System.out.println("Sabor bolo : " + bolo.getFlavor());
		System.out.println("Preço bolo : " + bolo.getPrice());
		
		System.out.println("Sabor bolo aniversario : " + boloAniv.getFlavor());
		System.out.println("Preço bolo aniversario : " + boloAniv.getPrice());
		
		System.out.println("Sabor bolo casamento : " + boloCasam.getFlavor());
		System.out.println("Preço bolo casamento : " + boloCasam.getPrice());

	}

}

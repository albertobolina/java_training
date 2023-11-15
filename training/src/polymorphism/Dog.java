package polymorphism;

public class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Ão, ão, ão ...");
	}
	
	public void fetch() {
		System.out.println("i'm fetching");
	}

}

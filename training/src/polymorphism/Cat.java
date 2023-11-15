package polymorphism;

public class Cat extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Miau, miau, miau");
	}
	
	public void scrath() {
		System.out.println("i'm scrathing your chair");
	}
	

}

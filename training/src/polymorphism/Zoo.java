package polymorphism;


public class Zoo {

	public static void main(String[] args) {
		
		Dog rocky = new Dog();
		rocky.makeSound();
		rocky.fetch();

		// ------- exemplos de polimorfismo -----------------
		System.out.println("exemplos de polimorfismo");
		Animal sasha = new Dog();      // é possivel porque Dog é filha de Animal. sasha é uma instancia de Dog, mas do tipo Animal
		sasha.makeSound();             // vai usar a versão do método overriden por Dog
		// sasha.fetch();              // embora sasha seja um Dog, só tem acesso aos métodos que herda de Animal

		sasha = new Cat();             // como Dog e Cat são classes filhas de Animal, isto pode ser feito. Agora sasha é uma instancia de Cat, mas do tipo Animal
		sasha.makeSound();	  		   // vai usar a versão do método overriden por Cat
		
		// ------- exemplos de typecasting -------------------
		System.out.println("exemplos de typecasting");
		// sasha.scratch();           // embora sasha seja uma instancia de Cat, é do tipo Animal, portanto não tem acesso ao método scratch
		((Cat)sasha).scrath();        // para que sasha tenha acesso aos métodos exclusivos de Cat, tem de ser feito o Down Casting do tipo (da classe pai para a filha)
				                      // no entanto, esta forma de fazer o down casting não é definitiva 
		
		Cat sashaTheCat = (Cat)sasha;   // desta forma podemos fazer o downcasting definitivo
		sashaTheCat.scrath();
		
		
		// ------- exemplos de typecasting e operador instanceof -------------------
		System.out.println("exemplos de typecasting e operador instanceof");
		
		Animal bia = new Dog();
		
		if (bia instanceof Dog biaTheDog) {    // esta instrução pemite verificar se a instancia é de um tipo e de seguida fazer o typecasting
			biaTheDog.fetch();
		}	
		
		Animal zita = new Cat();
		
		if (zita instanceof Cat) {             // este conjunto de instruções faz o mesmo que 
			Cat zitaTheCat = (Cat)zita;		   // a instrução anterior	
			zitaTheCat.scrath();
		}
	}
}

package inheritance;

import java.io.Console;

public class InheritanceChecker {
	// OBSERV:
	// esta classe tem como objectivo demonstrar as varias aprendizagens efectuadas no package "inheritance"

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(args[0]);
		
		if (opcao == 1) {
			System.out.println("1 - Exemplo uso de construtores na herança de classes");
			System.out.println("-----------------------------------------------------");
			
			Person pessoa = new Person();

			// a classe "Empregado" tem como classe pai a classe "Person" 
			Empregado empregado = new Empregado();  
		}
		else if (opcao == 2) {
			System.out.println("2 - Exemplo Overriding e Overloading de métodos herdados");
			System.out.println("-----------------------------------------------------");
			
			// exemplos OVERRIDE
			Rectangulo rectan = new Rectangulo();
			rectan.setLength(20);
			rectan.setWidth(30);
			System.out.println("O perimetro do rectangulo é " + rectan.calculaPerimetro());
			
			Quadrado square = new Quadrado();
			square.setLength(10);
			System.out.println("O perimetro do quadrado é " + square.calculaPerimetro());
			
			
			// exemplo OVERLOAD
		    rectan.print();
		    square.print();
		    square.print("Quadrado");
			
		}
		else {
			System.out.println("Nenhuma opção selecionada");
		}
		
		
		
		
		
//		/* os métodos get e set da classe pai podem ser acedidos desde a classe filha,
//		 * de forma transparente
//		 */
//		empregado.setName("Pedro");
//		empregado.setGender("Man");
//		empregado.setAge(51);
//		empregado.setEmpregadoId("PedroMiguel");
//		empregado.setTitulo("programador");
//		
//		System.out.println("Nome : " + empregado.getName());

	}

}

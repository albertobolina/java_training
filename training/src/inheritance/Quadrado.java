package inheritance;

public class Quadrado extends Rectangulo{

	// campos da classe
	// os campos "sides" e "length" são herdados da classe pai
	
	// métodos da classe
	
	//             OVERRIDE
	@Override							 // para fazer o override a anotação não é obrigatoria, mas pode ajudar a detetar erros
	public double calculaPerimetro() {   //override de um método da classe pai, ou seja, os dois métodos têm a mesma assinatura, 
		return sides * length;			 // código diferente	
	} 									 // OVERRIDE e modificadores de acesso
										 // No método overriden não podemos diminuir o ambito do modificador, por exemplo de "public" para "protected"
										 // Mas podemos aumentar o ambito, por exemplo de "protected" para "public"
	
	//             OVERLOAD
	public void print(String what) {				// o overload trata-se de métodos com o mesmo nome, mas assinaturas diferentes
		System.out.println("Eu sou um " + what);
	}
	
}

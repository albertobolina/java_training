package tiposDeDados;

public class operacaoComBits {

	public static void main(String[] args) {
		// Falamos aqui de operadores que permitem fazer operações bit a bit de um numero
		
		// bitwise OR, operador |
		//    0101     = 5
		//  | 0111     = 7
		//  ---------------
		//    0111     = 7
		
		byte var1 = 5, var2 = 7;
		System.out.println(var1 + " OR " + var2 + " = " + (var1 | var2));
		
		
		// bitwise AND, operador &
		//    0101     = 5
		//  & 0111     = 7
		//  ---------------
		//    0101     = 5
		
		byte var3 = 5, var4 = 7;
		System.out.println(var3 + " AND " + var4 + " = " + (var3 & var4));
		
		
		// bitwise XOR, operador ^
        //    0101     = 5
		//  ^ 0111     = 7
		//  ---------------
		//    0010     = 2
				
		byte var5 = 5, var6 = 7;
		System.out.println(var5 + " XOR " + var6 + " = " + (var5 ^ var6));
	}

}

package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		String s = "Texto";
		s.toUpperCase();
		/*
		 *  String é uma classe
		 *  Quando se cria um determinado valor de uma classe, esse valor é um objeto.
		 *  no exemplo da string cima s é um objeto
		 *  notação ponta é  atribuição de um atributo ou comportamento a um objeto
		 *  Os tipos primitivos {int, double, float, etc} não tem notação ponto, ou seja, não tem comportamentos associados
		 */
		
		//Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		
		
	}

}

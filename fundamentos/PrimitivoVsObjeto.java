package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		String s = "Texto";
		s.toUpperCase();
		/*
		 *  String � uma classe
		 *  Quando se cria um determinado valor de uma classe, esse valor � um objeto.
		 *  no exemplo da string cima s � um objeto
		 *  nota��o ponta �  atribui��o de um atributo ou comportamento a um objeto
		 *  Os tipos primitivos {int, double, float, etc} n�o tem nota��o ponto, ou seja, n�o tem comportamentos associados
		 */
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		
		
	}

}

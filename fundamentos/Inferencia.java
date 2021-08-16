package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 12;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		/*
		 *  Ao usar variável VAR o JAVA já faz a inferência automática de que tipo se trata. 
		 *  Porém, uma vez declarada, eu não posso mudar o valor da variável para outro tipo.
		 */
	}

}

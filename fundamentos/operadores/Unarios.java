package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); // Ordem de precedÍncia. Aqui ele primeiro vai incrementar o a depois comparar e depois decrementar o b
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}

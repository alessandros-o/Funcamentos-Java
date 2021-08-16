package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);// usamos o cast para trasformar de int para double para dar a divis�o inteira
		
		System.out.println(a % b);// esse � o operador m�dulo usado para dar o resto da divis�o
		System.out.println(8 % 3);
		System.out.println(x + y - a * b);
		
	}

}

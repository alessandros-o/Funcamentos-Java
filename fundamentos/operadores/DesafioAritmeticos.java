package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		int d = b / c;
		
		System.out.println(d);
		
		int x = (1 - 5) * (2 - 7);
		double y = x / 2;
		int z = (int) Math.pow(y, 2);
		
		System.out.println(z);
		
		double A = d - z;
		int B = (int) Math.pow(A, 3);
		int C = (int) Math.pow(10, 3);
		
		System.out.println(B / C);
		
		// outra forma de fazer
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		
		
	}

}

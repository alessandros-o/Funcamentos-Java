package fundamentos;

public class AreaCircunferencia {
	// atalho para criar o main [Digita main e depois ctrl + espaço]
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		// atalho para completar o system [digita syso + ctlr + espaço + enter]
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}

}

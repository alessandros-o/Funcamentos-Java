package fundamentos.exercicios;

public class Bhaskara {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		double raiz = Math.sqrt(delta);
		
		double x1 = (- b + raiz) / 2;
		double x2 = (- b - raiz) / 2;
		
		System.out.printf("As raízes da equação (ax2 + bx + c = 0) são: %.1f e %.1f", x1, x2);
		
		// ctlr + shift 2 vezes abre a lista de teclas de atalho
	}

}

package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu salário");// várias formas de fazer
		String s = entrada.nextLine();
		String salario1 = s.replace(",", ".");
		s = entrada.nextLine();
		String salario2 = s.replace(",", ".");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		
		System.out.println("Média é " + soma / 3);
		
		entrada.close();
		
	}

}

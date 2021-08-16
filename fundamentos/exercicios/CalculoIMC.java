package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		String peso = entrada.next().replace(",", ".");
		
		System.out.println("Digite sua altura:");
		String altura = entrada.next().replace(",", ".");
		
		double valor1 = Double.parseDouble(peso);
		double valor2 = Double.parseDouble(altura);
		double calculo1 = Math.pow(valor2, 2);
		double calculo = (valor1 / calculo1);
		
		System.out.printf("Seu IMC é: %.1f", calculo);
		
		entrada.close();
		
		
		
	}

}

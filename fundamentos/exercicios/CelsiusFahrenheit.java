package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Graus Celsius:");
		double temperaturaC = entrada.nextDouble();
		double calculo1 = temperaturaC * (9/5) + 32;
		
		System.out.println(calculo1);
		
		entrada.close();
	}

}

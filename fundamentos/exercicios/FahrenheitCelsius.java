package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		double temperaturaF = entrada.nextDouble();
		double calculo = (temperaturaF - 32) * (5/9);
		
		System.out.println(calculo);
		
		entrada.close();
	}

}

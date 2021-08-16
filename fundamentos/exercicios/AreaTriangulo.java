package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a medida da base:");
		int base = entrada.nextInt();
		System.out.println("Digite a medida da altura:");
		int altura = entrada.nextInt();
		
		int calculo = (base * altura) / 2;
		
		System.out.println((double) calculo);
		
		entrada.close();
		
	}

}

package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		/*
		 * Cenário 1: Se os dois trabalhos derem certo > shopping comprar TV 50"
		 * Cenário 2: Se apenas 1 dos dois trabalhos derem certo > shopping comprar TV 32"
		 * No cenário 1 e 2: tomar sorvete
		 * Cenário 3: nenhum dos trabalhos deu certo > ficar em casa e ficar mais saudável pq n vai tomar sorvete
		 */
		
		//boolean trabalho1 = false;
		//boolean trabalho2 = false;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Trabalhou na terça? (Escreva: true ou false)");
		Boolean trabalho1 = Boolean.parseBoolean(entrada.nextLine());
		
		System.out.println("Trabalhou na quinta? (Escreva: true ou false)");
		Boolean trabalho2 = Boolean.parseBoolean(entrada.nextLine());
		
		boolean cenario1 = trabalho1 && trabalho2;
		boolean cenario2 = trabalho1 ^ trabalho2;
		boolean cenario3 = !trabalho1 && !trabalho2;
		boolean tomarSorvete = cenario1 || cenario2;
		
		
		System.out.println("Comprar TV de 50? " + cenario1);
		System.out.println("Comprar TV de 32? " + cenario2);
		System.out.println("Ficar em casa? " + cenario3);
		System.out.println("Tomar Sorvete? " + tomarSorvete);
		System.out.println("Ficar saudável? " + !tomarSorvete);
		
		entrada.close();
	}

}

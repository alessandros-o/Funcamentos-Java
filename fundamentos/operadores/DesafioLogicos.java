package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		/*
		 * Cen�rio 1: Se os dois trabalhos derem certo > shopping comprar TV 50"
		 * Cen�rio 2: Se apenas 1 dos dois trabalhos derem certo > shopping comprar TV 32"
		 * No cen�rio 1 e 2: tomar sorvete
		 * Cen�rio 3: nenhum dos trabalhos deu certo > ficar em casa e ficar mais saud�vel pq n vai tomar sorvete
		 */
		
		//boolean trabalho1 = false;
		//boolean trabalho2 = false;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Trabalhou na ter�a? (Escreva: true ou false)");
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
		System.out.println("Ficar saud�vel? " + !tomarSorvete);
		
		entrada.close();
	}

}
